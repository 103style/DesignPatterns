package com.lxk.designpatterns.AbstractFactoryPattern.colorimp;

import com.lxk.designpatterns.AbstractFactoryPattern.IColor;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 14:57
 */
public class Yellow implements IColor {
    @Override
    public void fill() {
        System.out.println("fill with yellow!");
    }
}
