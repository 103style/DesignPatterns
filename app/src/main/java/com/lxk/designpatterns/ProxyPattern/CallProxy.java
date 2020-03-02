package com.lxk.designpatterns.ProxyPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:32
 */
public class CallProxy implements ICall {

    RealCall realCall;

    public RealCall getRealCall() {
        if (realCall == null) {
            System.out.println("creat a realcall!");
            realCall = RealCall.newRealCall("test request", true);
        }
        return realCall;
    }

    //...

    @Override
    public Object request() {
        return getRealCall().request();
    }

    @Override
    public boolean forWebSocket() {
        return getRealCall().forWebSocket();
    }
}
