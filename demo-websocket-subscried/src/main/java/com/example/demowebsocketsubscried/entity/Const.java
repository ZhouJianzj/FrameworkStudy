package com.example.demowebsocketsubscried.entity;

public class Const {

    public enum Channel{

        AAA_CHANNEL(1,"/topic/AAA"),
        BBB_CHANNEL(2,"/topic/BBB");

        private final int code;
        private final String name;

        Channel(int code, String name) {
            this.code = code;
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
}
