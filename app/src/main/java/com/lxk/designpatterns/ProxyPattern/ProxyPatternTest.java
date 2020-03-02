package com.lxk.designpatterns.ProxyPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:33
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        ICall call = new CallProxy();
        System.out.println("call's request = " + call.request());
        System.out.println("call's forwebsocket = " + call.forWebSocket());
    }
}
