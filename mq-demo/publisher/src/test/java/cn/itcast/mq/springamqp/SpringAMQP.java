package cn.itcast.mq.springamqp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAMQP {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSpringAMQP(){
        // 队列名称
        String queueName = "simple.queue";
        // 消息
        String message = "hello, spring amqp——————!";
        // 发送消息
        for (int i = 0; i < 50; i++) {
            rabbitTemplate.convertAndSend(queueName, message + i);
        }
    }
    @Test
    public void testSendMessageToFanoutExchange(){
        // 队列名称
        String exchange = "fanoutExchange";
        // 消息
        String message = "hello, spring amqp——————!";
        // 发送消息
        for (int i = 0; i < 50; i++) {
            rabbitTemplate.convertAndSend(exchange, "",message + i);
        }
    }


}
