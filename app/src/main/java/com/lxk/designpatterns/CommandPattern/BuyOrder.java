package com.lxk.designpatterns.CommandPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 10:29
 */
public class BuyOrder implements IOrder {
    private Stock stock;

    public BuyOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
