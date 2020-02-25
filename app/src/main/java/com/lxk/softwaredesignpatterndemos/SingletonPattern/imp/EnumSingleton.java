package com.lxk.softwaredesignpatterndemos.SingletonPattern.imp;

import com.lxk.softwaredesignpatterndemos.SingletonPattern.IUnique;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 16:33
 * 枚举型单例
 */
public enum EnumSingleton implements IUnique {
    /**
     * 示例
     */
    INSTANCE;

    public static EnumSingleton getInstance() {
        return EnumSingleton.INSTANCE;
    }

    @Override
    public int getId() {
        return this.hashCode();
    }

}
