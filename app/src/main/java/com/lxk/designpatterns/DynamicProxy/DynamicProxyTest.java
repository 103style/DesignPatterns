package com.lxk.designpatterns.DynamicProxy;

/**
 * @author https://github.com/103style
 * @date 2020/3/18 13:57
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        ISinger singer = new Jim();
        ISinger proxy = DynamicProxy.newProxyInstance(singer);
        proxy.sing();
    }
}
