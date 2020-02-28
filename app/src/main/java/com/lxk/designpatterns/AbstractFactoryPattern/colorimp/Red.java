package com.lxk.designpatterns.AbstractFactoryPattern.colorimp;

import com.lxk.designpatterns.AbstractFactoryPattern.IColor;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 14:56
 */
public class Red implements IColor {
    @Override
    public void fill() {
        System.out.println("fill with red!");
    }
}
