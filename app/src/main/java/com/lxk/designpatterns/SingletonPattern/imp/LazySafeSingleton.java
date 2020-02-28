package com.lxk.designpatterns.SingletonPattern.imp;


import com.lxk.designpatterns.SingletonPattern.IUnique;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 16:18
 * 懒汉式 线程安全
 * 1.需要的时候才创建
 * 2.线程安全
 */
public class LazySafeSingleton implements IUnique {

    private static LazySafeSingleton instance;

    public LazySafeSingleton() {
    }

    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }

    @Override
    public int getId() {
        return this.hashCode();
    }

}
