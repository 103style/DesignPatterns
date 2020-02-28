package com.lxk.designpatterns.AbstractFactoryPattern;

import com.lxk.designpatterns.AbstractFactoryPattern.factoryimp.ColorFactory;
import com.lxk.designpatterns.AbstractFactoryPattern.factoryimp.ShapeFactory;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 15:10
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbsFactory shapeFactory = FactoryCreate.createFactory(FactoryCreate.FactoryName.SHAPE);
        IShape circle = shapeFactory.getShape(ShapeFactory.SHAPE.CIRCLE);
        circle.draw();

        AbsFactory colorFactory = FactoryCreate.createFactory(FactoryCreate.FactoryName.COLOR);
        IColor red = colorFactory.getColor(ColorFactory.Color.RED);
        red.fill();


        IShape square = shapeFactory.getShape(ShapeFactory.SHAPE.SQUARE);
        square.draw();
        IColor green = colorFactory.getColor(ColorFactory.Color.GREEN);
        green.fill();


        IShape rectangle = shapeFactory.getShape(ShapeFactory.SHAPE.RECTANGLE);
        rectangle.draw();
        IColor yellow = colorFactory.getColor(ColorFactory.Color.YELLOW);
        yellow.fill();
    }
}
