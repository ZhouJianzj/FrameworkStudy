package cn.itcast.hotel.web;


import cn.itcast.hotel.pojo.HotelDoc;
import cn.itcast.hotel.pojo.PageResult;
import cn.itcast.hotel.pojo.QueryParams;
import cn.itcast.hotel.service.IHotelService;
import com.alibaba.fastjson.JSON;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.sort.SortBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author zhoujian
 */
@RestController()
@RequestMapping("hotel")
public class HotelController {



    @Autowired
    private IHotelService iHotelService;

    @PostMapping("list")
    public PageResult queryHotels(@RequestBody QueryParams queryParams) throws IOException {

        return iHotelService.search(queryParams);

    }

}
