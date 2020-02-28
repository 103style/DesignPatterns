package com.lxk.designpatterns.ObserverPattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/24 17:17
 * 观察者模式的测试
 */
public class ObserverTest {

    public static void main(String[] args) {

        IObserverManager observerManager = new ObserverManagerImp();
        for (int i = 0; i < 10; i++) {
            observerManager.addObserver(new ObserverImp(i));
        }
        observerManager.notifyAllObserver("Hello Observer Pattern");
    }
}
