package com.lxk.designpatterns.FlyweightPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:09
 */
public class Circle implements IShape {
    private int x, y, radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle info: x = " + x + ", y = " + y + ", radius" + radius);
    }
}
