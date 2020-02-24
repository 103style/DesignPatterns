package com.lxk.softwaredesignpatterndemos.ObserverPattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/24 17:10
 * 管理观察者的抽象接口
 */
public interface IObserverManager {
    /**
     * 添加需要的观察者
     *
     * @param observer 观察者实例
     */
    void addObserver(IObserver observer);

    /**
     * 移除需要的观察者
     *
     * @param observer 观察者实例
     */
    void removeObserver(IObserver observer);

    /**
     * 通知所有观察者实例
     *
     * @param msg 通知内容
     */
    void notifyAllObserver(String msg);
}
