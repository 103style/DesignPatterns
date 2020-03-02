package com.lxk.designpatterns.BridgePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 14:04
 */
public class Circle extends AbsShape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, IDraw iDraw) {
        super(iDraw);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(IDraw iDraw) {
        super(iDraw);
    }

    @Override
    public void draw() {
        iDraw.drawCircle();
    }
}
