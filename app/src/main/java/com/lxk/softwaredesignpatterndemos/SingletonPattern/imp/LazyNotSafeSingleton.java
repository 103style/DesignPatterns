package com.lxk.softwaredesignpatterndemos.SingletonPattern.imp;

import com.lxk.softwaredesignpatterndemos.SingletonPattern.IUnique;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 16:15
 * 懒汉式 线程不安全
 * 1.需要的时候才创建
 * 2.线程不安全
 */
public class LazyNotSafeSingleton implements IUnique {

    private static LazyNotSafeSingleton instance;

    public LazyNotSafeSingleton() {
    }

    public static LazyNotSafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyNotSafeSingleton();
        }
        return instance;
    }

    @Override
    public int getId() {
        return this.hashCode();
    }
}
