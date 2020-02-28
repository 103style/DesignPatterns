package com.lxk.designpatterns.PrototypePattern.imp;

import com.lxk.designpatterns.PrototypePattern.AbsSheep;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 10:18
 */
public class JerrySheep extends AbsSheep {
    public JerrySheep() {
        name = "Jerry";
    }

    @Override
    public void say() {
        System.out.println("Jerry Jerry Jerry!");
    }
}
