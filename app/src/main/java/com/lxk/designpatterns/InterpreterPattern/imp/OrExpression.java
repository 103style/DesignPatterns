package com.lxk.designpatterns.InterpreterPattern.imp;

import com.lxk.designpatterns.InterpreterPattern.IExpression;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 11:14
 */
public class OrExpression implements IExpression {

    private IExpression expr1;
    private IExpression expr2;

    public OrExpression(IExpression expr1, IExpression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String order) {
        return expr1.interpret(order) || expr2.interpret(order);
    }
}
