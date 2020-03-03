package com.lxk.designpatterns.TemplatePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 17:07
 */
public abstract class AbsGame {

    /**
     * 初始化
     */
    public abstract void init();

    /**
     * 开始游戏
     */
    public abstract void start();

    /**
     * 结束游戏
     */
    public abstract void end();


    public final void play() {
        init();
        //...
        start();
        //...
        end();
    }
}
