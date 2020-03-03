package com.lxk.designpatterns.VisitorPattern.imp;

import com.lxk.designpatterns.VisitorPattern.IComputerPartVisitor;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 17:20
 */
public class ComputerVisitImp implements IComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor.");
    }
}
