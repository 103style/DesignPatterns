package com.lxk.softwaredesignpatterndemos.ObserverPattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/24 17:09
 * 观察者的实现类
 */
public class ObserverImp implements IObserver {

    private int id;

    public ObserverImp(int id) {
        this.id = id;
    }

    @Override
    public void notify(String msg) {
        System.out.println("ObserverImp " + id + " got a notify msg = " + msg);
    }
}
