package com.lxk.designpatterns.TemplatePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 17:11
 */
public class TemplatePatternTest {

    public static void main(String[] args) {
        AbsGame game = new GameFlyBird();
        game.play();

        System.out.println();

        game = new GameFootball();
        game.play();
    }
}
