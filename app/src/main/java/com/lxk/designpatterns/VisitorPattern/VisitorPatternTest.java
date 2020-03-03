package com.lxk.designpatterns.VisitorPattern;

import com.lxk.designpatterns.ChainofResponsibilityPattern.imp.ConnectIntercept;
import com.lxk.designpatterns.VisitorPattern.imp.Computer;
import com.lxk.designpatterns.VisitorPattern.imp.ComputerVisitImp;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 17:21
 */
public class VisitorPatternTest {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.accept(new ComputerVisitImp());
    }
}
