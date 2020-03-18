package com.lxk.designpatterns.DynamicProxy;

/**
 * @author https://github.com/103style
 * @date 2020/3/18 13:54
 */
public class Jim implements ISinger {
    @Override
    public void sing() {
        System.out.println("Jim is singing!");
    }
}
