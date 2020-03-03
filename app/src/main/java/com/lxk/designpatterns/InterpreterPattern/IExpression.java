package com.lxk.designpatterns.InterpreterPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 11:09
 */
public interface IExpression {
    /**
     * 解释器
     *
     * @param order 命令
     * @return 结果
     */
    boolean interpret(String order);
}
