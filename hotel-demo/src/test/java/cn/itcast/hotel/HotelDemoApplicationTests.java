package cn.itcast.hotel;

import cn.itcast.hotel.pojo.Hotel;
import cn.itcast.hotel.pojo.HotelDoc;
import cn.itcast.hotel.service.IHotelService;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

import static cn.itcast.hotel.constants.HotelConstant.MapDSL;

@SpringBootTest
class HotelDemoApplicationTests {

    private RestHighLevelClient restHighLevelClient;
    @Autowired
    private IHotelService iHotelService;

    @Test
    void contextLoads() {
        System.out.println(restHighLevelClient);
    }

    /**
     * 所有测试方法之前执行、
     * 客户端连接es
     */
    @BeforeEach
    void testEsRestClient() {
        restHighLevelClient = new RestHighLevelClient(RestClient
                .builder(HttpHost.create("http://8.142.74.249:9200")));
    }

    /**
     * 所有测试方法之后执行
     * 客户端关闭连接
     */
    @AfterEach
    void testCloseEsClient() throws IOException {
        restHighLevelClient.close();
    }

    /**
     * 创建索引库
     *
     * @throws IOException
     */
    @Test
    void testEsClientCreateIndex() throws IOException {
//        创建索引请求并且命名索引为/hotel
        CreateIndexRequest indexRequest = new CreateIndexRequest("hotel");
//        指定索引的映射关系，也就是类似数据库中的表结构
        CreateIndexRequest source = indexRequest.source(MapDSL, XContentType.JSON);
//        客户端发送创建索引的请求
        CreateIndexResponse createIndexResponse = restHighLevelClient.indices().create(indexRequest, RequestOptions.DEFAULT);
    }

    /**
     * 删除索引库
     */
    @Test
    void testDeleteIndex() throws IOException {
        DeleteIndexRequest request = new DeleteIndexRequest("hotel");
        restHighLevelClient.indices().delete(request, RequestOptions.DEFAULT);
    }

    /**
     * 判断索引库是否存在
     *
     * @throws IOException
     */
    @Test
    void testExitedIndex() throws IOException {
        GetIndexRequest request = new GetIndexRequest("hotel");
        boolean r = restHighLevelClient.indices().exists(request, RequestOptions.DEFAULT);
        System.out.println(r ? "索引库存在" : "索引库不存在");
    }

    /**
     * 往索引库中添加文档
     *
     * @throws IOException
     */
    @Test
    void testCreateDocument() throws IOException {
        IndexRequest hotelDocumentRequest = new IndexRequest("hotel").id("36934");
        HotelDoc hotelDoc = new HotelDoc(iHotelService.getById(36934));

        hotelDocumentRequest.source(JSON.toJSONString(hotelDoc), XContentType.JSON);
        restHighLevelClient.index(hotelDocumentRequest, RequestOptions.DEFAULT);
    }


    /**
     * 查询索引库中的文档
     *
     * @throws IOException
     */
    @Test
    void testGetDocument() throws IOException {
        GetRequest request = new GetRequest("hotel", "36934");
        GetResponse response = restHighLevelClient.get(request, RequestOptions.DEFAULT);

        String json = response.getSourceAsString();
        HotelDoc hotelDoc = JSON.parseObject(json, HotelDoc.class);
        System.err.println(hotelDoc);
    }

    /**
     * 局部更新索引库中对应文档的属性
     *
     * @throws IOException
     */
    @Test
    void testUpdateDocument() throws IOException {
        UpdateRequest updateRequest = new UpdateRequest("hotel", "36934");
        updateRequest.doc(
                "score", 28,
                "starName", "四星"
        );
        restHighLevelClient.update(updateRequest, RequestOptions.DEFAULT);
    }

    /**
     * 删除索引库中的文档
     *
     * @throws IOException
     */
    @Test
    void testDeleteDocument() throws IOException {
        DeleteRequest request = new DeleteRequest("hotel", "36934");
        restHighLevelClient.delete(request, RequestOptions.DEFAULT);
    }


    /**
     * 一次性批量导入数据到索引库中去
     *
     * @throws IOException
     */
    @Test
    void testBuIkCreateDocument() throws IOException {
        BulkRequest bulkRequest = new BulkRequest();
        List<Hotel> list = iHotelService.list();
        list.stream().forEach(hotel -> {
            HotelDoc hotelDoc = new HotelDoc(hotel);
            bulkRequest.add(
                    new IndexRequest("hotel")
                            .id(hotel.getId().toString())
                            .source(JSON.toJSONString(hotelDoc), XContentType.JSON));
        });
        restHighLevelClient.bulk(bulkRequest, RequestOptions.DEFAULT);
    }


    /**
     * MatchALl查询
     *
     * @throws IOException
     */
    @Test
    void testMatchAll() throws IOException {

        SearchRequest request = new SearchRequest("hotel");
        request.source().query(QueryBuilders.matchAllQuery());
        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);
        extracted(response);
    }

    private void extracted(SearchResponse response) {
        SearchHits hits = response.getHits();
        long value = hits.getTotalHits().value;
        System.out.println("搜索到的全部不数据条数为：" + value);
        SearchHit[] resultTotals = hits.getHits();
        for (SearchHit resultTotal : resultTotals) {
            String sourceAsString = resultTotal.getSourceAsString();
            HotelDoc hotelDoc = JSON.parseObject(sourceAsString, HotelDoc.class);
            System.out.println(hotelDoc);
        }
    }


    /**
     * 个别属性查询,all属性是多个属性字段copy to的字段属性
     *
     * @throws IOException
     */
    @Test
    void testMatch() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source().query(QueryBuilders.matchQuery("all", "如家"));
        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);
        extracted(response);
    }


    /**
     * 精准查询termQuery
     *
     * @throws IOException
     */
    @Test
    void testTermQuery() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source().query(QueryBuilders.termQuery("name", "如家"));
        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);
        extracted(response);
    }

    /**
     * 精准查询termQuery
     *
     * @throws IOException
     */
    @Test
    void testRangeQuery() throws IOException {
        SearchRequest request = new SearchRequest("hotel");
        request.source().query(QueryBuilders.rangeQuery("price").gte("100").lte("200"));
        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);
        extracted(response);
    }

    /**
     * 复合查询
     *
     * @throws IOException
     */
    @Test
    void testBoolQuery() throws IOException {
        SearchRequest request = new SearchRequest("hotel");

        request.source().query(QueryBuilders.
                boolQuery()
                .must(QueryBuilders.matchQuery("brand", "如家"))
                .filter(QueryBuilders.rangeQuery("price").lte("150"))
        );
        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);
        extracted(response);
    }


    /**
     * 查询排序
     *
     * @throws IOException
     */
    @Test
    void testSortQuery() throws IOException {
        SearchRequest request = new SearchRequest("hotel");

        request
                .source()
                .query(QueryBuilders.
                        boolQuery()
                        .must(QueryBuilders.matchQuery("brand", "如家"))
                        .filter(QueryBuilders.rangeQuery("price").lte("150"))
                ).sort("price", SortOrder.ASC);
        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);
        extracted(response);
    }

    /**
     * 查询排序
     *
     * @throws IOException
     */
    @Test
    void testPageQuery() throws IOException {
        SearchRequest request = new SearchRequest("hotel");

        request
                .source()
                .query(QueryBuilders.
                        boolQuery()
                        .must(QueryBuilders.matchQuery("brand", "如家"))
                        .filter(QueryBuilders.rangeQuery("price").lte("150"))
                ).from(0).size(2);
        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);
        extracted(response);
    }


    /**
     * 查询排序
     *
     * @throws IOException
     */
    @Test
    void testHeight() throws IOException {
        SearchRequest request = new SearchRequest("hotel");

        request
                .source()
                .query(QueryBuilders.
                        boolQuery()
                        .must(QueryBuilders.matchQuery("brand", "如家"))
                        .filter(QueryBuilders.rangeQuery("price").lte("150"))
                )
                .highlighter(new HighlightBuilder().field("name").requireFieldMatch(false))
                .from(0)
                .size(2);
        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);
        SearchHit[] hits = response.getHits().getHits();
        for (SearchHit hotel : hits) {
            //获取高亮字段
            HighlightField field = hotel.getHighlightFields().get("name");
            //将高亮字段转换成字符串
            String name = field.getFragments()[0].toString();
            HotelDoc hotelDoc = JSON.parseObject(hotel.getSourceAsString(), HotelDoc.class);
            hotelDoc.setName(name);
            System.out.println(hotelDoc);
        }

    }


    @Test
    void testAggregations() throws IOException {

        SearchRequest request = new SearchRequest("hotel");
        request.source().size(0);
        request.source().aggregation(AggregationBuilders
                //指定聚合类型并且命名为brandAggregation
                .terms("brandAggregation")
                //需要聚合的字段
                .field("brand").
                size(10)
                //字聚合 min stats max avg
                .subAggregation(AggregationBuilders
                        .stats("scoreAggregation")
                        .field("score")));
        SearchResponse response = restHighLevelClient.search(request, RequestOptions.DEFAULT);

        Aggregations aggregations = response.getAggregations();
        //需要转换一下类型
        Terms termsAggregation = aggregations.get("brandAggregation");
        List<? extends Terms.Bucket> buckets = termsAggregation.getBuckets();
        for (Terms.Bucket bucket : buckets) {
            System.out.println(bucket.getKeyAsString());
        }

    }


}
