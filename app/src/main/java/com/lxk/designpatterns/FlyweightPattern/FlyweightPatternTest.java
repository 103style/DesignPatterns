package com.lxk.designpatterns.FlyweightPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 18:15
 */
public class FlyweightPatternTest {
    private static final String[] colors =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Circle circle = ShapeCache.getCircle(getRandomColor());
            circle.setX(getRandom());
            circle.setY(getRandom());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandom() {
        return (int) (Math.random() * 100);
    }
}
