package com.lxk.designpatterns.FlyweightPattern;

import java.util.HashMap;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:12
 */
public class ShapeCache {
    private static final HashMap<String, IShape> cacheMap = new HashMap<>();

    public static Circle getCircle(String color) {
        IShape circle = cacheMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            cacheMap.put(color, circle);
            System.out.println("created a circle, color = " + color);
        }
        return (Circle) circle;
    }
}
