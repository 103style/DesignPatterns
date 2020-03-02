package com.lxk.designpatterns.ChainofResponsibilityPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:44
 */
public interface IInterceptor {
    /**
     * 传递给下层
     *
     * @param chain 传递线路
     * @return 响应结果
     */
    Object intercept(Chain chain);

    interface Chain {
        /**
         * 请求信息
         *
         * @return 请求信息
         */
        Object request();

        /**
         * 执行下一层逻辑
         *
         * @param request 请求信息
         * @return 响应结果
         */
        Object proceed(Object request);
    }
}
