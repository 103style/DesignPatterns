package com.lxk.designpatterns.StrategyPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 16:39
 */
public class StrategyAdd implements IStrategy {

    @Override
    public int doOperation(int x, int y) {
        return x + y;
    }
}
