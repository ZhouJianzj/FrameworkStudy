package cn.itcast.mq.listeners;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 队列监听器
 * @author zhoujian
 */
@Component
public class MQListener {



    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct.queueOne"),
            exchange = @Exchange(name = "direct.exchange",type = ExchangeTypes.DIRECT),
            key = {"red","blue"}
    ))
    public void queueOne(String message){
        System.out.println("queueOne----->" + message);
    }


    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct.queueTwo"),
            exchange = @Exchange(name = "direct.exchange",type = ExchangeTypes.DIRECT),
            key = {"red","yellow"}
    ))
    public void queueTwo(String message){
        System.out.println("queueTwo----->" + message);
    }


}
