package cn.itcast.hotel;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static cn.itcast.hotel.constants.HotelConstant.*;

@SpringBootTest
class HotelAdminApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void deleteQueue() {
        rabbitTemplate.convertAndSend(HOTEL_TOPIC_EXCHANGE,HOTEL_DELETE_QUEUE_KEY,"executing delete .....");
    }

    @Test
    void insertQueue() {
        rabbitTemplate.convertAndSend(HOTEL_TOPIC_EXCHANGE,HOTEL_INSERT_QUEUE_KEY,"executing insert .....");
    }

}
