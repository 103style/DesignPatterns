package com.lxk.designpatterns.BridgePattern.imp;

import com.lxk.designpatterns.BridgePattern.IDraw;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 14:02
 */
public class GreenCircle implements IDraw {
    @Override
    public void drawCircle() {
        System.out.println("draw a green circle!");
    }
}
