package com.lxk.designpatterns.AbstractFactoryPattern.factoryimp;

import com.lxk.designpatterns.AbstractFactoryPattern.AbsFactory;
import com.lxk.designpatterns.AbstractFactoryPattern.IColor;
import com.lxk.designpatterns.AbstractFactoryPattern.IShape;
import com.lxk.designpatterns.AbstractFactoryPattern.colorimp.Green;
import com.lxk.designpatterns.AbstractFactoryPattern.colorimp.Red;
import com.lxk.designpatterns.AbstractFactoryPattern.colorimp.Yellow;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 15:04
 */
public class ColorFactory extends AbsFactory {
    @Override
    public IColor getColor(int color) {
        switch (color) {
            case Color.GREEN:
                return new Green();
            case Color.RED:
                return new Red();
            case Color.YELLOW:
                return new Yellow();
            default:
                break;
        }
        return null;
    }

    @Override
    public IShape getShape(String shape) {
        return null;
    }

    public interface Color {
        int RED = 1;
        int YELLOW = 2;
        int GREEN = 3;
    }
}
