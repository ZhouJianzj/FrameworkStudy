package com.zj.demo15springcloudrestfourmethodconsumer.web;


import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class Controller {

    @Resource
    private RestTemplate restTemplate;

    /**
     * 请求另外一个服务的时候有返回值，指定路径的参数是可变长、map、没有
     *
     * @return
     */
    @RequestMapping("doGetForEntity")
    public String doGetForEntity() {
        String url = "http://localhost:8081/doGetForEntity";
        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
        return "doGetForEntity消费者-----消费了----" + forEntity.getBody();
    }

    /**
     * 请求另外一个服务的时候没有返回值，指定的是请求参数对象必须是LinkedMultiValueMap
     *
     * @return
     */
    @RequestMapping("doPostForEntity")
    public String doPostForEntity() {
        String url = "http://localhost:8081/doPostForEntity";
        LinkedMultiValueMap<String, String> stringStringLinkedMultiValueMap = new LinkedMultiValueMap<>();
        stringStringLinkedMultiValueMap.add("name", "zhoujian");
//        请求参可以为null
        ResponseEntity<String> forEntity = restTemplate.postForEntity(url, stringStringLinkedMultiValueMap, String.class);
        return "doPostForEntity消费者-----消费了----" + forEntity.getBody();
    }

    /**
     * 被调用的另外一个服务是没有返回值的，是以post的方式发送请求的，请求参数的传递方式和上面的post方法一样的
     *
     * @return
     */
    @RequestMapping("doPut")
    public String doPut() {
        String url = "http://localhost:8081/doPut";
        LinkedMultiValueMap<String, String> stringStringLinkedMultiValueMap = new LinkedMultiValueMap<>();
        stringStringLinkedMultiValueMap.add("name", "zhoujian");
//        请求参数可以为null
        restTemplate.put(url, stringStringLinkedMultiValueMap);
        return "doPut消费者-----消费了----";
    }

    /**
     * 被调用的另外一个服务是没有返回值的，是以get方式发送请求的，所以蚕食传递是在请求地址上传递的，可以是可变长的、可以是Map、可以没有
     *
     * @return
     */
    @RequestMapping("doDelete")
    public String doDelete() {
        String url = "http://localhost:8081/doDelete";
        String name = "zhoujian";
        restTemplate.delete(url, name);
        return "doDelete消费者-----消费了----";
    }
}
