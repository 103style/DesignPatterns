package com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.colorimp;

import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.IColor;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 14:58
 */
public class Green implements IColor {
    @Override
    public void fill() {
        System.out.println("fill with green!");
    }
}
