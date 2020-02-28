package com.lxk.designpatterns.AbstractFactoryPattern.factoryimp;

import com.lxk.designpatterns.AbstractFactoryPattern.AbsFactory;
import com.lxk.designpatterns.AbstractFactoryPattern.IColor;
import com.lxk.designpatterns.AbstractFactoryPattern.IShape;
import com.lxk.designpatterns.AbstractFactoryPattern.shapeimp.Circle;
import com.lxk.designpatterns.AbstractFactoryPattern.shapeimp.Rectangle;
import com.lxk.designpatterns.AbstractFactoryPattern.shapeimp.Square;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 15:01
 */
public class ShapeFactory extends AbsFactory {
    @Override
    public IColor getColor(int color) {
        return null;
    }

    @Override
    public IShape getShape(String shape) {
        switch (shape) {
            case SHAPE.CIRCLE:
                return new Circle();
            case SHAPE.RECTANGLE:
                return new Rectangle();
            case SHAPE.SQUARE:
                return new Square();
            default:
                break;
        }
        return null;
    }

    public interface SHAPE {
        String CIRCLE = "circle";
        String RECTANGLE = "rectangle";
        String SQUARE = "square";
    }
}
