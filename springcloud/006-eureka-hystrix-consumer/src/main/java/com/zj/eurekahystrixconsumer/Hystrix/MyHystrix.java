package com.zj.eurekahystrixconsumer.Hystrix;


import com.netflix.hystrix.HystrixCommand;
import org.springframework.web.client.RestTemplate;

/**
 * 自定义的熔断器
 */
public class MyHystrix extends HystrixCommand<String> {
    private RestTemplate restTemplate;
    private String url;

    public MyHystrix(Setter setter, RestTemplate restTemplate, String url) {
        super(setter);
        this.restTemplate = restTemplate;
        this.url = url;

    }

    @Override
    protected String run() throws Exception {
        return restTemplate.getForObject(url, String.class);
    }

    @Override
    protected String getFallback() {
//        获取异常信息
        System.out.println("------------------------------------>" + super.getFailedExecutionException().getMessage());
        return "------------自定义熔断了服务--------";
    }

}
