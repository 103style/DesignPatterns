package com.lxk.designpatterns.InterpreterPattern;

import com.lxk.designpatterns.InterpreterPattern.imp.AndExpression;
import com.lxk.designpatterns.InterpreterPattern.imp.OrExpression;
import com.lxk.designpatterns.InterpreterPattern.imp.TerminalExpression;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 11:16
 */
public class InterpreterPatternTest {

    public static void main(String[] args) {
        InterpreterPatternTest test = new InterpreterPatternTest();
        IExpression isMale = test.getMaleExpression();
        IExpression isMarriedWoman = test.getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }

    /**
     * 规则：Robert 和 John 是男性
     */
    private IExpression getMaleExpression() {
        IExpression robert = new TerminalExpression("Robert");
        IExpression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /**
     * 规则：Julie 是一个已婚的女性
     */
    private IExpression getMarriedWomanExpression() {
        IExpression julie = new TerminalExpression("Julie");
        IExpression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
