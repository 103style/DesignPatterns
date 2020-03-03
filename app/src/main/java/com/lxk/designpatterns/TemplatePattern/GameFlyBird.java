package com.lxk.designpatterns.TemplatePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 17:09
 */
public class GameFlyBird extends AbsGame {
    @Override
    public void init() {
        System.out.println("GameFlyBird init");
    }

    @Override
    public void start() {
        System.out.println("GameFlyBird start");
    }

    @Override
    public void end() {
        System.out.println("GameFlyBird end");
    }
}
