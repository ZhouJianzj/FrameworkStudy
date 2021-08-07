package com.zj;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        创建对象，里面的ip就是redis服务器的ip，端口就是redis服务器的端口
        Jedis jedis = new Jedis("192.168.235.130",6378);
//        测试是否可以连接成功 成返回pong
        System.out.println(jedis.ping());
    }
}
