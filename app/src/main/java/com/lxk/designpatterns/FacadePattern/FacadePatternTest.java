package com.lxk.designpatterns.FacadePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 17:21
 */
public class FacadePatternTest {

    public static void main(String[] args) {
        InitManager manager = new InitManager();
        manager.init();
    }
}
