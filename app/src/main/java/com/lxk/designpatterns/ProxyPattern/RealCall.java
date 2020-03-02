package com.lxk.designpatterns.ProxyPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:26
 */
public class RealCall implements ICall {
    private final Object request;
    private final boolean forWebSocket;

    public RealCall(Object request, boolean forWebSocket) {
        this.request = request;
        this.forWebSocket = forWebSocket;
    }

    static RealCall newRealCall(Object request, boolean forWebSocket) {
        return new RealCall(request, forWebSocket);
    }

    @Override
    public Object request() {
        return request;
    }

    @Override
    public boolean forWebSocket() {
        return forWebSocket;
    }
}
