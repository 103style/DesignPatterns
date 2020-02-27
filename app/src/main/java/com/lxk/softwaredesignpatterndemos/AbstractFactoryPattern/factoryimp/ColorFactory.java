package com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.factoryimp;

import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.AbsFactory;
import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.IColor;
import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.IShape;
import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.colorimp.Green;
import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.colorimp.Red;
import com.lxk.softwaredesignpatterndemos.AbstractFactoryPattern.colorimp.Yellow;

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
