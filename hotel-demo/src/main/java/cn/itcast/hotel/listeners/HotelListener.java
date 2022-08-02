package cn.itcast.hotel.listeners;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static cn.itcast.hotel.constants.HotelConstant.*;

@Component
public class HotelListener {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = HOTEL_DELETE_QUEUE),
            exchange = @Exchange(name = HOTEL_TOPIC_EXCHANGE,type = ExchangeTypes.TOPIC),
            key = {HOTEL_DELETE_QUEUE_KEY}
    ))
    public void listenDeleteEvent(String message) {
        System.err.println(message);
    }


    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = HOTEL_INSERT_QUEUE),
            exchange = @Exchange(name = HOTEL_TOPIC_EXCHANGE,type = ExchangeTypes.TOPIC),
            key = {HOTEL_INSERT_QUEUE_KEY}
    ))
    public void listenInsertEvent(String message) {
        System.err.println(message);
    }
}
