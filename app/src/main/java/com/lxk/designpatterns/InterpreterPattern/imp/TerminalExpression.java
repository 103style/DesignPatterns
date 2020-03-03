package com.lxk.designpatterns.InterpreterPattern.imp;

import com.lxk.designpatterns.InterpreterPattern.IExpression;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 11:12
 */
public class TerminalExpression implements IExpression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String order) {
        return order.contains(data);
    }
}
