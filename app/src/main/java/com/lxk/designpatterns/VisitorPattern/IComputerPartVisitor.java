package com.lxk.designpatterns.VisitorPattern;


import com.lxk.designpatterns.VisitorPattern.imp.Computer;
import com.lxk.designpatterns.VisitorPattern.imp.Keyboard;
import com.lxk.designpatterns.VisitorPattern.imp.Monitor;
import com.lxk.designpatterns.VisitorPattern.imp.Mouse;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 17:18
 */
public interface IComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
