package com.lxk.designpatterns.MementoPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 14:29
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }
}
