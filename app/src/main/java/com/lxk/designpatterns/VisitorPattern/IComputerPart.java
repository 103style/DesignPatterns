package com.lxk.designpatterns.VisitorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 17:15
 */
public interface IComputerPart {
    /**
     * @param visitor 访问者
     */
    void accept(IComputerPartVisitor visitor);
}
