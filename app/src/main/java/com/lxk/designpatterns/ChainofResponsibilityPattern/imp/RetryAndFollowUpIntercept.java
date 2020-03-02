package com.lxk.designpatterns.ChainofResponsibilityPattern.imp;

import com.lxk.designpatterns.ChainofResponsibilityPattern.IInterceptor;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:47
 */
public class RetryAndFollowUpIntercept implements IInterceptor {
    @Override
    public Object intercept(Chain chain) {
        System.out.println("start RetryAndFollowUpIntercept  chain");
        //...
        Object response = chain.proceed(chain.request());
        //...
        System.out.println("RetryAndFollowUpIntercept get response form the next chain");
        return response;
    }
}
