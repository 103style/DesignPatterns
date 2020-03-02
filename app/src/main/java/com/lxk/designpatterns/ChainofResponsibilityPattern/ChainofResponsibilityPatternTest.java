package com.lxk.designpatterns.ChainofResponsibilityPattern;

import com.lxk.designpatterns.ChainofResponsibilityPattern.imp.BridgeIntercept;
import com.lxk.designpatterns.ChainofResponsibilityPattern.imp.CacheIntercept;
import com.lxk.designpatterns.ChainofResponsibilityPattern.imp.CallServerInterceptor;
import com.lxk.designpatterns.ChainofResponsibilityPattern.imp.ConnectIntercept;
import com.lxk.designpatterns.ChainofResponsibilityPattern.imp.LogIntercept;
import com.lxk.designpatterns.ChainofResponsibilityPattern.imp.RetryAndFollowUpIntercept;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 19:11
 */
public class ChainofResponsibilityPatternTest {

    public static void main(String[] args) {
        List<IInterceptor> interceptors = new ArrayList<>();
        interceptors.add(new LogIntercept());
        interceptors.add(new RetryAndFollowUpIntercept());
        interceptors.add(new BridgeIntercept());
        interceptors.add(new CacheIntercept());
        interceptors.add(new ConnectIntercept());
        interceptors.add(new CallServerInterceptor());

        Object request = "test request";
        RealInterceptorChain chain = new RealInterceptorChain(interceptors, 0, request);
        chain.proceed(request);
    }
}