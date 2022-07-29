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
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.xcontent.XContentType;
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
        restHighLevelClient.bulk(bulkRequest,RequestOptions.DEFAULT);
    }

}
