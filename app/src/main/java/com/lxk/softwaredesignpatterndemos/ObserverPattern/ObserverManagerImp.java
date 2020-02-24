package com.lxk.softwaredesignpatterndemos.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/2/24 17:13
 * 管理观察者的实现类
 */
public class ObserverManagerImp implements IObserverManager {
    /**
     * 保存观察者的集合
     */
    private List<IObserver> iObservers;

    public ObserverManagerImp() {
        iObservers = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        iObservers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        iObservers.remove(observer);
    }

    @Override
    public void notifyAllObserver(String msg) {
        for (IObserver observer : iObservers) {
            observer.notify(msg);
        }
    }
}
