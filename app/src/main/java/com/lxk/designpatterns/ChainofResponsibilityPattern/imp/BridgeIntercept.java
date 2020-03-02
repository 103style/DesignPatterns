package com.lxk.designpatterns.ChainofResponsibilityPattern.imp;

import com.lxk.designpatterns.ChainofResponsibilityPattern.IInterceptor;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:52
 */
public class BridgeIntercept implements IInterceptor {
    @Override
    public Object intercept(Chain chain) {
        System.out.println("start BridgeIntercept  chain");
        //...
        Object response = chain.proceed(chain.request());
        //...
        System.out.println("BridgeIntercept get response form the next chain");
        return response;
    }
}
