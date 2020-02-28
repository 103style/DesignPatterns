package com.lxk.designpatterns.SingletonPattern.imp;

import com.lxk.designpatterns.SingletonPattern.IUnique;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 16:20
 * 饿汉式
 * 1.加载类时即创建
 * 2. 线程安全
 */
public class SafeNotLazySingleton implements IUnique {

    private static SafeNotLazySingleton instance = new SafeNotLazySingleton();

    public SafeNotLazySingleton() {

    }

    public static SafeNotLazySingleton getInstance() {
        return instance;
    }

    @Override
    public int getId() {
        return this.hashCode();
    }
}
