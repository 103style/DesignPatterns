package com.lxk.designpatterns.CommandPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 10:37
 */
public class CommandPatternTest {

    public static void main(String[] args) {
        Stock stockAli = new Stock("alibaba", 100);
        Stock stockTencent = new Stock("tencent", 100);
        Stock stockMT = new Stock("maotai", 100);

        OrderExecute execute = new OrderExecute();
        execute.addOrder(new SellOrder(stockAli));
        execute.addOrder(new SellOrder(stockTencent));
        execute.addOrder(new BuyOrder(stockMT));
        execute.execute();
    }
}
