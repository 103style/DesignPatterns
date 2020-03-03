package com.lxk.designpatterns.NullObjectPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 16:21
 */
public class MaidReal extends AbsMaid {

    public MaidReal(String name) {
        this.name = name;
    }

    @Override
    public boolean isNUll() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
