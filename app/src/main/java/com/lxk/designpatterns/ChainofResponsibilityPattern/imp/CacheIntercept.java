package com.lxk.designpatterns.ChainofResponsibilityPattern.imp;

import com.lxk.designpatterns.ChainofResponsibilityPattern.IInterceptor;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:52
 */
public class CacheIntercept implements IInterceptor {
    @Override
    public Object intercept(Chain chain) {
        System.out.println("start CacheIntercept  chain");
        //...
        Object response = chain.proceed(chain.request());
        //...
        System.out.println("CacheIntercept get response form the next chain");
        return response;
    }
}
