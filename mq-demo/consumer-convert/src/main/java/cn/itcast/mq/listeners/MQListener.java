package cn.itcast.mq.listeners;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 队列监听器
 * @author zhoujian
 */
@Component
public class MQListener {


    @RabbitListener(queues = "queue.convert")
    public void receiveMessageOne(Map<String, Object> message) throws InterruptedException {
        System.out.println(message.toString());
    }

}
