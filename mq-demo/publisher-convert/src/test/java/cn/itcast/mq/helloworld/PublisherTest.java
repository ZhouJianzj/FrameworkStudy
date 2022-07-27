package cn.itcast.mq.helloworld;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PublisherTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSendMessageToFanoutExchange(){
        // 队列名称
        String queueName = "queue.convert";
        // 消息
        Map<String, Object> message = new HashMap<>();
        message.put("name","zhoujian");
        message.put("age","12");

        // 发送消息
        for (int i = 0; i < 50; i++) {
            rabbitTemplate.convertAndSend(queueName,message );
        }
    }

}
