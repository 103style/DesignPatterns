package com.lxk.designpatterns.DecoratorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 16:34
 */
public abstract class Observer {

    public abstract void onNext();

    public abstract void onComplete();

    public abstract void onError();

}
