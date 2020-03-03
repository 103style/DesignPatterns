package com.lxk.designpatterns.StrategyPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 16:43
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        StrategyHolder holder = new StrategyHolder(new StrategyAdd());
        System.out.println("10 + 5 = " + holder.execute(10, 5));

        holder.setStrategy(new StrategySubtract());
        System.out.println("10 - 5 = " + holder.execute(10, 5));

        holder.setStrategy(new StrategyMultiply());
        System.out.println("10 * 5 = " + holder.execute(10, 5));
    }
}
