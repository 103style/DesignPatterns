package com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.shapeimp;

import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.IShape;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 14:53
 */
public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("draw a rectangle!");
    }
}
