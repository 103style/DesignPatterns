package com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.shapeimp;

import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.IShape;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 14:52
 */
public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("draw a circle!");
    }
}
