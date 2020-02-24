package com.lxk.softwaredesignpatterndemos.ObserverPattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/24 17:07
 * 观察者的抽象接口
 */
public interface IObserver {
    /**
     * 通知
     *
     * @param msg 通知内容
     */
    void notify(String msg);
}
