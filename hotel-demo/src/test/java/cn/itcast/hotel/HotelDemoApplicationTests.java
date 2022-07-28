package cn.itcast.hotel;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static cn.itcast.hotel.constants.HotelConstant.MapDSL;

@SpringBootTest
class HotelDemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(restHighLevelClient);
    }


    private RestHighLevelClient restHighLevelClient;

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



    @Test
    void testEsClientCreateIndex() throws IOException {
//        创建索引请求并且命名索引为/hotel
        CreateIndexRequest indexRequest = new CreateIndexRequest("hotel");
//        指定索引的映射关系，也就是类似数据库中的表结构
        CreateIndexRequest source = indexRequest.source(MapDSL, XContentType.JSON);
//        客户端发送创建索引的请求
        CreateIndexResponse createIndexResponse = restHighLevelClient.indices().create(indexRequest, RequestOptions.DEFAULT);
    }

}
