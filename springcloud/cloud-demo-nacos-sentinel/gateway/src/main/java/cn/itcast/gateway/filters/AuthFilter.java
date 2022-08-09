//package cn.itcast.gateway.filters;
//
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.util.MultiValueMap;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//
//
///**
// *
// * 值越小优先级越大,最大的是负2........
// * @author zhoujian
// */
//@Order(-1)
//@Component
//public class AuthFilter implements GlobalFilter {
//
//
//    /**
//     * @param exchange  请求的上下文,可以获取请求和相应
//     * @param chain 执行链,类似开关
//     * @return
//     */
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request = exchange.getRequest();
//        MultiValueMap<String, String> queryParams = request.getQueryParams();
//        String auth = queryParams.getFirst("auth");
//        if ("auth".equals(auth)){
//            return chain.filter(exchange);
//        }
//        //设置状态码为没有认证,最后返回相应结束
//        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//        return exchange.getResponse().setComplete();
//    }
//}
