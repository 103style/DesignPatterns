package com.lxk.designpatterns.IteratorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 13:18
 */
public interface IIterator {
    /**
     * 是否有子节点
     */
    boolean hasNext();

    /**
     * 子节点
     */
    Object next();
}
