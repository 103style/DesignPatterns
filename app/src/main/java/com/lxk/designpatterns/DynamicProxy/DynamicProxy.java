package com.lxk.designpatterns.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author https://github.com/103style
 * @date 2020/3/18 13:55
 */
public class DynamicProxy implements InvocationHandler {

    private ISinger singer;

    public DynamicProxy(ISinger singer) {
        this.singer = singer;
    }

    /**
     * 创建动态代理对象
     *
     * @param singer 被代理的对象
     */
    public static ISinger newProxyInstance(ISinger singer) {
        DynamicProxy dynamicProxy = new DynamicProxy(singer);
        return (ISinger) Proxy.newProxyInstance(singer.getClass().getClassLoader(), singer.getClass().getInterfaces(), dynamicProxy);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(singer, args);
    }
}
