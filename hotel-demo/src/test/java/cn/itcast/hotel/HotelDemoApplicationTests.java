package cn.itcast.hotel;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

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

}
