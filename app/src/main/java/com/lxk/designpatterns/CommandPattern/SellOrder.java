package com.lxk.designpatterns.CommandPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 10:30
 */
public class SellOrder implements IOrder {
    private Stock stock;

    public SellOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
