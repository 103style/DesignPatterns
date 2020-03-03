package com.lxk.designpatterns.IteratorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 13:19
 */
public interface IContainer {
    /**
     * 获取迭代器
     */
    IIterator iterator();
}
