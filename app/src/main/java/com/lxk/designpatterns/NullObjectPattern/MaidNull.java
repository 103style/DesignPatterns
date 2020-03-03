package com.lxk.designpatterns.NullObjectPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 16:21
 */
public class MaidNull extends AbsMaid {
    @Override
    public boolean isNUll() {
        return true;
    }

    @Override
    public String getName() {
        return "No Maid found";
    }
}
