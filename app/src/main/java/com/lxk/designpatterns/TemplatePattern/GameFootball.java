package com.lxk.designpatterns.TemplatePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 17:10
 */
public class GameFootball extends AbsGame {
    @Override
    public void init() {
        System.out.println("GameFootball init");
    }

    @Override
    public void start() {
        System.out.println("GameFootball start");
    }

    @Override
    public void end() {
        System.out.println("GameFootball end");
    }
}
