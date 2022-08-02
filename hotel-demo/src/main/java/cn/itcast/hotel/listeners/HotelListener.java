package cn.itcast.hotel.listeners;


import cn.itcast.hotel.service.IHotelService;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static cn.itcast.hotel.constants.HotelConstant.*;

@Component
public class HotelListener {


    @Autowired
    private IHotelService iHotelService;




    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = HOTEL_DELETE_QUEUE),
            exchange = @Exchange(name = HOTEL_TOPIC_EXCHANGE,type = ExchangeTypes.TOPIC),
            key = {HOTEL_DELETE_QUEUE_KEY}
    ))
    public void listenDeleteEvent(String id) {
        System.err.println(id);
        iHotelService.deleteById(id);

    }


    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = HOTEL_INSERT_QUEUE),
            exchange = @Exchange(name = HOTEL_TOPIC_EXCHANGE,type = ExchangeTypes.TOPIC),
            key = {HOTEL_INSERT_QUEUE_KEY}
    ))
    public void listenInsertEvent(String id) {

        System.err.println(id);
        iHotelService.insertById(id);
    }
}
