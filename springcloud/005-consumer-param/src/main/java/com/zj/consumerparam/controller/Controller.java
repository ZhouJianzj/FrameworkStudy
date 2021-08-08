package com.zj.consumerparam.controller;

import com.zj.consumerparam.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoujian
 */
@RestController
public class Controller {
    /**
     * 使用数组的形式传递参数
     * @return
     */
    @RequestMapping("doList")
    public String doList(){
        RestTemplate restTemplate = new RestTemplate();
//        url中使用占位符的形式，里面的数字就是数组中的元素下标
        String url = "http://localhost:8081/doList?id={0}&name={1}&age={2}";
        Object[] param = {001,"zhoujian",22};

        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class,param);
        return forEntity.getBody();

    }

    /**
     * 使用map的方式传递参数
     * @return
     */
    @RequestMapping("doMap")
    public  String doMap(){
        RestTemplate restTemplate = new RestTemplate();

        HashMap hashMap = new HashMap();
        hashMap.put("id","001");
        hashMap.put("name","zhoujian");
        hashMap.put("age","22");
        String url = "http://localhost:8081/doList?id={id}&name={name}&age={age}";

        ResponseEntity<String> forEntity = restTemplate.getForEntity(url,String.class,hashMap);
        return  forEntity.getBody();
    }

    /**
     * 返回值，返回是一个对象的时候，当返回的是一List集合的时候里面的元素都不会转换成对应的存储时候的对象类型，都是linkHashMap类型的数据
     * 是因为我们使用的是getForEntity()
     * @return
     */
    @RequestMapping("doReturnUser")
    public String doReturnUser(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8081/doReturn?id={0}&name={1}&age={2}";
        Object[] param = {001,"zhoujian",22};

        ResponseEntity<User> forEntity = restTemplate.getForEntity(url, User.class,param);
        User body = forEntity.getBody();
        System.out.println(body.getName());
        return body.toString();

    }

    /**
     * 演示的是使用getForObject()方法返回的直接是返回的服务提供者返回的对象而不是 ResponseEntity
     * @return
     */
    @RequestMapping("doReturnGetForObject")
    public String doReturnGetForObject(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8081/doReturnGetForObject?id={0}&name={1}&age={2}";
        Object[] param = {001,"zhoujian",22};

        User forObject = restTemplate.getForObject(url, User.class, param);
        return forObject.toString();
    }

    /**
     * 演示使用post发送请求 postForEntity,里面的参数是有讲究的，是有返回值的
     * @return
     */
    @RequestMapping("doPostForEntity")
    public String doPostForEntity(){
        RestTemplate restTemplate = new RestTemplate();
        LinkedMultiValueMap lM= new LinkedMultiValueMap();
        lM.add("id","001");
        lM.add("name","zhoujian");
        lM.add("age","22");
        ResponseEntity<User> objectResponseEntity = restTemplate.postForEntity("http://localhost:8081/doPostForEntity",lM,User.class);
        return objectResponseEntity.getBody().toString();
    }

    /**
     * 演示put方法 ，使用的是post发送的请求没有返回值，非必要不使用这个方法
     * @return
     */
    @RequestMapping("doPut")
    public String doPut(){
        RestTemplate restTemplate = new RestTemplate();
//        put请求和服务提供者之间传递的参数只能是这样
        LinkedMultiValueMap lM= new LinkedMultiValueMap();
        lM.add("id","001");
        lM.add("name","zhoujian");
        lM.add("age","22");
//        参数的传递
        restTemplate.put("http://localhost:8081/doPut",lM);
        return "put方法以post方式发送请求没有返回值非必要不使用";
    }

    /**
     * 演示使用delete发送请求，是以get方式发送的也是没有返回值的，非必要的不使用
     * @return
     */
    @RequestMapping("doDelete")
    public String doDelete(){
        RestTemplate restTemplate = new RestTemplate();
        Map lM= new HashMap();
        lM.put("id","001");
        lM.put("name","zhoujian");
        lM.put("age","22");
        restTemplate.delete("http://localhost:8081/doDelete?id={id}&name={name}&age={age}",lM);
        return  "delete方式以get方式发送请求没有返回值非必要不使用";
    }


}
