package com.zj;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        创建对象，里面的ip就是redis服务器的ip，端口就是redis服务器的端口
        Jedis jedis = new Jedis("192.168.235.128", 6379);
//        测试是否可以连接成功 成返回pong
        System.out.println(jedis.ping());
        Set<String> keys = jedis.keys("*");


        keys.forEach(key -> System.out.println(key));
    }
}
