package cn.itcast.mq.listeners;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 队列监听器
 * @author zhoujian
 */
@Component
public class MQListener {


    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "topic.queue1"),
            exchange = @Exchange(name = "topic.exchange" ,type = ExchangeTypes.TOPIC),
            key = {"china.#"}
    ))
    public void queueOne(String message){
        System.out.println( "china_____ " + message);
    }



    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "topic.queue2"),
            exchange = @Exchange(name = "topic.exchange" ,type = ExchangeTypes.TOPIC),
            key = {"*.news"}
    ))
    public void queueTwo(String message){
        System.out.println( "_____news" + message);
    }
}
