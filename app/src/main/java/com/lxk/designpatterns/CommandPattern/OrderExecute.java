package com.lxk.designpatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 10:35
 */
public class OrderExecute {
    private List<IOrder> orders;

    public OrderExecute() {
        orders = new ArrayList<>();
    }

    public void addOrder(IOrder order) {
        orders.add(order);
    }

    public void execute() {
        for (IOrder order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
