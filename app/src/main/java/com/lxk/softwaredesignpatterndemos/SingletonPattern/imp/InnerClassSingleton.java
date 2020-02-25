package com.lxk.softwaredesignpatterndemos.SingletonPattern.imp;

import com.lxk.softwaredesignpatterndemos.SingletonPattern.IUnique;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 16:23
 * 静态内部类方式
 * 1.需要的时候才创建
 * 2.线程安全
 */
public class InnerClassSingleton implements IUnique {

    public InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return Holder.INSTACE;
    }

    @Override
    public int getId() {
        return this.hashCode();
    }

    private static class Holder {
        private static final InnerClassSingleton INSTACE = new InnerClassSingleton();
    }
}
