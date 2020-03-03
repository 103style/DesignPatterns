package com.lxk.designpatterns.MementoPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 14:28
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
