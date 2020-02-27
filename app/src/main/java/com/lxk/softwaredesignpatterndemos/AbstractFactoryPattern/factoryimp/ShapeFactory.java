package com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.factoryimp;

import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.AbsFactory;
import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.IColor;
import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.IShape;
import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.shapeimp.Circle;
import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.shapeimp.Rectangle;
import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.shapeimp.Square;

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
