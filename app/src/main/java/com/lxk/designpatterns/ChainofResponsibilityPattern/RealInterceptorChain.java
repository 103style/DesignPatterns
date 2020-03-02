package com.lxk.designpatterns.ChainofResponsibilityPattern;

import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 19:04
 */
public class RealInterceptorChain implements IInterceptor.Chain {
    private final List<IInterceptor> interceptors;
    private final int index;
    private final Object request;

    public RealInterceptorChain(List<IInterceptor> interceptors, int index, Object request) {
        this.interceptors = interceptors;
        this.index = index;
        this.request = request;
    }

    @Override
    public Object request() {
        return request;
    }

    @Override
    public Object proceed(Object request) {
        if (index >= interceptors.size()) {
            throw new AssertionError();
        }
        RealInterceptorChain next = new RealInterceptorChain(interceptors, index + 1, request);
        IInterceptor interceptor = interceptors.get(index);
        Object response = interceptor.intercept(next);
        //...
        return response;
    }
}
