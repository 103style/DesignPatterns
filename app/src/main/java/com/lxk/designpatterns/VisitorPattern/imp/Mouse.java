package com.lxk.designpatterns.VisitorPattern.imp;

import com.lxk.designpatterns.VisitorPattern.IComputerPart;
import com.lxk.designpatterns.VisitorPattern.IComputerPartVisitor;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 17:17
 */
public class Mouse implements IComputerPart {
    @Override
    public void accept(IComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
