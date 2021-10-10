package com.zj.demospringcloudhystrixprovider.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Controller {

    @RequestMapping("one")
    public String one(){

        return  "one--provider" ;
    }

    @RequestMapping("two")
    public String two(){
        System.out.println(10/0);
        return  "two--provider" ;
    }
}
