package com.example.like.likelib;

/**
 * Created by like on 16/3/11.
 */
public class Hello {

    private static class HelloHolder {
        private final static Hello INSTACNE = new Hello();
    }

    public static Hello getInstance() {
        return HelloHolder.INSTACNE;
    }

    public String hello() {
        return "Hello world by like";
    }
}
