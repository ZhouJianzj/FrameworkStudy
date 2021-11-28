package com.example.demo01gateway.filter;


import com.alibaba.fastjson.JSON;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.HashMap;

/**
 * @author zhoujian
 * 全局的过滤器实现权限验证
 */
@Component
public class Filter implements GlobalFilter, Ordered {
    private static final String PATH = "/user/login";
    private static final String CHARSET_NAME = "utf-8";
    private static final String TOKEN = "true";

    @Override
    public int getOrder() {
        return 0;
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();

        // 获取请求路径
        String path = request.getPath().toString();
        System.out.println("path:" + path + "=====================");
        // 获取请求参数中token的值
        String token = request.getQueryParams().getFirst("token");
        System.out.println("token" + token);
        // 判断是否请求的login页面
        if (path.contains(PATH)) {
            //  请求路径中含有/login,则放行
            return chain.filter(exchange);
            // 没有访问登录页面，判断请求参数中token的值是否为true
        } else if (TOKEN.equals(token)) {
            // 若请求参数token的值为true，则放行
            return chain.filter(exchange);
            // 请求路径中没有login，并且请求参数的token的值不为true，进行拦截
        } else {
            // 响应结果，响应数据为JSON数据
            HashMap data = new HashMap();
            DataBuffer buffer = null;
            try {
                data.put("code", 404);
                data.put("msg", "请先登录");
                byte[] bytes = JSON.toJSONString(data).getBytes(CHARSET_NAME);
                buffer = response.bufferFactory().wrap(bytes);
                response.setStatusCode(HttpStatus.UNAUTHORIZED);
                response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return response.writeWith(Mono.just(buffer));
        }
    }
}