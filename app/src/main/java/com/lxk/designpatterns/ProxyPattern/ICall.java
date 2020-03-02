package com.lxk.designpatterns.ProxyPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:23
 */
public interface ICall {
    /**
     * 获取请求信息
     *
     * @return 请求信息
     */
    Object request();

    boolean forWebSocket();
}
