package cn.itcast.mq.listeners;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.nio.channels.Channel;

/**
 * 队列监听器
 * @author zhoujian
 */
@Component
public class MQListener {


//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue(name = "topic.queue1"),
//            exchange = @Exchange(name = "topic.exchange" ,type = ExchangeTypes.TOPIC),
//            key = {"china.#"}
//    ))
//    public void queueOne(String message){
//        System.out.println( "china_____ " + message);
//    }
//
//
//
//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue(name = "topic.queue2"),
//            exchange = @Exchange(name = "topic.exchange" ,type = ExchangeTypes.TOPIC),
//            key = {"*.news"}
//    ))
//    public void queueTwo(String message){
//        System.out.println( "_____news" + message);
//    }


    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "mqtt-subscription-300219070542qos0",declare = "false"),
            exchange = @Exchange(name = "amq.topic" ,type = ExchangeTypes.TOPIC),
            key = {"Topic.flexem.fbox.#"}
    ))
    public void queueOne(String message){
        System.out.println(  message);
    }
}
