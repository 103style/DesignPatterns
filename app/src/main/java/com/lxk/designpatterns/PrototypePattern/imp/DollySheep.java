package com.lxk.designpatterns.PrototypePattern.imp;

import com.lxk.designpatterns.PrototypePattern.AbsSheep;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 10:16
 */
public class DollySheep extends AbsSheep {

    public DollySheep() {
        name = "Dolly";
    }

    @Override
    public void say() {
        System.out.println("Dolly Dolly Dolly!");
    }
}
