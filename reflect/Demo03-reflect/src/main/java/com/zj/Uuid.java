package com.zj;

import java.util.UUID;

public class Uuid {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        String str = uuid.randomUUID().toString();
        System.out.println(str.replaceAll("-",""));
    }
}
