package com.lxk.designpatterns.SingletonPattern.imp;

import com.lxk.designpatterns.SingletonPattern.IUnique;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 16:21
 * 双检锁/双重校验锁 DCL，即 double-checked locking
 * <p>
 * 1.需要的时候才创建
 * 2.线程安全
 */
public class DCLSingleton implements IUnique {
    private volatile static DCLSingleton instance;

    private DCLSingleton() {
    }

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    public int getId() {
        return this.hashCode();
    }
}
