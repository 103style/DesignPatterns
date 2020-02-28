package com.lxk.designpatterns.AbstractFactoryPattern;

import com.lxk.designpatterns.AbstractFactoryPattern.factoryimp.ColorFactory;
import com.lxk.designpatterns.AbstractFactoryPattern.factoryimp.ShapeFactory;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 15:08
 */
public class FactoryCreate {

    public static AbsFactory createFactory(String name) {
        switch (name) {
            case FactoryName.COLOR:
                return new ColorFactory();
            case FactoryName.SHAPE:
                return new ShapeFactory();
            default:
                return null;
        }
    }

    public interface FactoryName {
        String SHAPE = "shape";
        String COLOR = "color";
    }
}
