package com.lxk.designpatterns.PrototypePattern.imp;

import com.lxk.designpatterns.PrototypePattern.AbsSheep;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 10:18
 */
public class TomSheep extends AbsSheep {
    public TomSheep() {
        name = "Tom";
    }

    @Override
    public void say() {
        System.out.println("Tom Tom Tom!");
    }
}
