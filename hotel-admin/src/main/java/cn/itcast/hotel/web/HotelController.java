package cn.itcast.hotel.web;

import cn.itcast.hotel.pojo.Hotel;
import cn.itcast.hotel.pojo.PageResult;
import cn.itcast.hotel.service.IHotelService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;

import static cn.itcast.hotel.constants.HotelConstant.*;

@RestController
@RequestMapping("hotel")
public class HotelController {

    @Autowired
    private IHotelService hotelService;

    @GetMapping("/{id}")
    public Hotel queryById(@PathVariable("id") Long id){
        return hotelService.getById(id);
    }

    @GetMapping("/list")
    public PageResult hotelList(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "size", defaultValue = "1") Integer size
    ){
        Page<Hotel> result = hotelService.page(new Page<>(page, size));

        return new PageResult(result.getTotal(), result.getRecords());
    }



    @Autowired
    private RabbitTemplate rabbitTemplate;


    /**
     * 数据的新增
     * @param hotel
     */
    @PostMapping
    public void saveHotel(@RequestBody Hotel hotel){
        hotelService.save(hotel);
        rabbitTemplate.convertAndSend(HOTEL_TOPIC_EXCHANGE
                ,HOTEL_INSERT_QUEUE_KEY,hotel.getId());

    }

    /**
     * 数据的修改
     * @param hotel
     */
    @PutMapping()
    public void updateById(@RequestBody Hotel hotel){
        if (hotel.getId() == null) {
            throw new InvalidParameterException("id不能为空");
        }
        hotelService.updateById(hotel);

        rabbitTemplate.convertAndSend(HOTEL_TOPIC_EXCHANGE
                ,HOTEL_INSERT_QUEUE_KEY,hotel.getId());
    }


    /**
     * 数据的删除
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        hotelService.removeById(id);

        rabbitTemplate.convertAndSend(HOTEL_TOPIC_EXCHANGE
                ,HOTEL_DELETE_QUEUE_KEY,id);
    }
}
