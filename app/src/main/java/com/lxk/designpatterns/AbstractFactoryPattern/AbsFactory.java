package com.lxk.designpatterns.AbstractFactoryPattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/27 14:59
 */
public abstract class AbsFactory {
    /**
     * 选择指定颜色填充
     */
    public abstract IColor getColor(int color);

    /**
     * 获取指定形状
     */
    public abstract IShape getShape(String shape);
}
