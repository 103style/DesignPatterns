package com.lxk.designpatterns.CommandPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 10:24
 */
public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("buy  Stock{name = " + name + ", quantity = " + quantity + "}");
    }

    public void sell() {
        System.out.println("sell  Stock{name = " + name + ", quantity = " + quantity + "}");
    }

}
