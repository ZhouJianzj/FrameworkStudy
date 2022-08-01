package cn.itcast.hotel.service.impl;

import cn.itcast.hotel.mapper.HotelMapper;
import cn.itcast.hotel.pojo.Hotel;
import cn.itcast.hotel.pojo.HotelDoc;
import cn.itcast.hotel.pojo.PageResult;
import cn.itcast.hotel.pojo.QueryParams;
import cn.itcast.hotel.service.IHotelService;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.lucene.search.BooleanQuery;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.geo.GeoPoint;
import org.elasticsearch.common.unit.DistanceUnit;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.sort.SortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class HotelService extends ServiceImpl<HotelMapper, Hotel> implements IHotelService {

    @Autowired
    private RestHighLevelClient client;

    @Override
    public PageResult search(QueryParams queryParams) throws IOException {
        //创建查询对象
        SearchRequest request = new SearchRequest("hotel");

        //构建DSl语句
        String key = queryParams.getKey();
        int page = queryParams.getPage();
        int size = queryParams.getSize();

        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        if (queryParams.getKey() == null || "".equals(queryParams.getKey()) ){
            boolQueryBuilder.must(QueryBuilders.matchAllQuery());
        }else {
            boolQueryBuilder.must(QueryBuilders.matchQuery("all",key));
        }

        if (queryParams.getCity() != null && ! "".equals(queryParams.getCity())){
            boolQueryBuilder.filter(QueryBuilders.termQuery("city",queryParams.getCity()) );
        }

        if (queryParams.getBrand() != null && !"".equals(queryParams.getBrand())){
            boolQueryBuilder.filter(QueryBuilders.termQuery("brand",queryParams.getBrand()) );
        }


        if (queryParams.getStarName() != null && !"".equals(queryParams.getStarName())){
            boolQueryBuilder.filter(QueryBuilders.termQuery("starName",queryParams.getStarName()) );
        }

        if (queryParams.getMaxPrice() != null &&  queryParams.getMinPrice() != null){
            boolQueryBuilder.filter(QueryBuilders.rangeQuery("price").gte(queryParams.getMinPrice()).lte(queryParams.getMaxPrice()) );
        }


        //距离排序
        if (queryParams.getLocation() != null && !"".equals(queryParams.getLocation())) {
            request
                    .source()
                    .sort(SortBuilders
                            .geoDistanceSort("location",new GeoPoint(queryParams.getLocation()))
                            .order(SortOrder.ASC)
                            .unit(DistanceUnit.KILOMETERS)
                    );
        }


        /**
         * functionScoreQuery
         */
        request.source()
                .query(QueryBuilders
                        .functionScoreQuery(QueryBuilders.matchQuery("name","速8酒店(上海赤峰路店)"),
                                new FunctionScoreQueryBuilder.FilterFunctionBuilder[]{
                                        new FunctionScoreQueryBuilder.FilterFunctionBuilder(
                                                QueryBuilders.termQuery("brand","速8"),
                                                ScoreFunctionBuilders.weightFactorFunction(10))
                                }));

        request
                .source()
//                .query(boolQueryBuilder)
                .from((page - 1) * size).size(size);

        //客户端执行查询
        SearchResponse response = client.search(request, RequestOptions.DEFAULT);

        //处理结果集
        return extracted(response);
    }


    /**
     * 结果集的处理
     * @param response
     * @return
     */
    private PageResult extracted(SearchResponse response) {
        SearchHits hits = response.getHits();
        Integer total = Math.toIntExact(hits.getTotalHits().value);
        ArrayList<HotelDoc> hotelDocs = new ArrayList<>();

        SearchHit[] resultTotals = hits.getHits();
        for (SearchHit resultTotal : resultTotals) {
            Object[] sortValues = resultTotal.getSortValues();

            String sourceAsString = resultTotal.getSourceAsString();
            HotelDoc hotelDoc = JSON.parseObject(sourceAsString, HotelDoc.class);

            //设置距离还有多远
          if (sortValues.length != 0){
              hotelDoc.setDistance(sortValues[0]);
          }
            hotelDocs.add(hotelDoc);
        }
        return new PageResult(total,hotelDocs);
    }
}
