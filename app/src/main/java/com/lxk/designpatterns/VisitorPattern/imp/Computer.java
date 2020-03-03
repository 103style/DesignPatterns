package com.lxk.designpatterns.VisitorPattern.imp;

import com.lxk.designpatterns.VisitorPattern.IComputerPart;
import com.lxk.designpatterns.VisitorPattern.IComputerPartVisitor;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 17:17
 */
public class Computer implements IComputerPart {

    IComputerPart[] parts;

    public Computer() {
        parts = new IComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(IComputerPartVisitor visitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
