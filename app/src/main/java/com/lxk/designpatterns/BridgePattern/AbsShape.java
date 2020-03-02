package com.lxk.designpatterns.BridgePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 14:02
 */
public abstract class AbsShape {
    protected IDraw iDraw;

    public AbsShape(IDraw iDraw) {
        this.iDraw = iDraw;
    }

    /**
     * 绘制
     */
    public abstract void draw();
}
