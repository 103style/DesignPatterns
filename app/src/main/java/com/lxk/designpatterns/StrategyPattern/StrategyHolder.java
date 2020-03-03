package com.lxk.designpatterns.StrategyPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 16:42
 */
public class StrategyHolder {

    private IStrategy strategy;

    public StrategyHolder(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int x, int y) {
        return strategy.doOperation(x, y);
    }
}
