package com.lxk.designpatterns.AbstractFactoryPattern.shapeimp;

import com.lxk.designpatterns.AbstractFactoryPattern.IShape;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 14:53
 */
public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("draw a square!");
    }
}
