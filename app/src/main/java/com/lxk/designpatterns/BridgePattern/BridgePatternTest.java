package com.lxk.designpatterns.BridgePattern;

import com.lxk.designpatterns.BridgePattern.imp.GreenCircle;
import com.lxk.designpatterns.BridgePattern.imp.RedCircle;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 14:05
 */
public class BridgePatternTest {

    public static void main(String[] args) {
        Circle redCircle = new Circle(0, 0, 10, new RedCircle());
        redCircle.draw();

        Circle greenCircle = new Circle(0, 0, 10, new GreenCircle());
        greenCircle.draw();
    }
}
