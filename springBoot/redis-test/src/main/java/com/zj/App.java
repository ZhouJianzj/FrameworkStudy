package com.zj;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Jedis jedis = new Jedis("192.168.235.130",6378);
        System.out.println(jedis.ping());
    }
}
