package cn.itcast.hotel;



@MapperScan("cn.itcast.hotel.mapper")
@SpringBootApplication
public class HotelDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelDemoApplication.class, args);
    }

    @Bean
    public  RestHighLevelClient restHighLevelClient(){
        return new RestHighLevelClient(RestClient
                .builder(HttpHost.create("http://8.142.74.249:9200")));
    }





}
