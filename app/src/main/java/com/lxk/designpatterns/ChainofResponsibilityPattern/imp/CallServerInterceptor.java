package com.lxk.designpatterns.ChainofResponsibilityPattern.imp;

import com.lxk.designpatterns.ChainofResponsibilityPattern.IInterceptor;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:53
 */
public class CallServerInterceptor implements IInterceptor {
    @Override
    public Object intercept(Chain chain) {
        System.out.println("start CallServerInterceptor  chain");
        //...
        Object response = "test response!";
        //...
        System.out.println("CallServerInterceptor finish");
        return response;
    }
}
