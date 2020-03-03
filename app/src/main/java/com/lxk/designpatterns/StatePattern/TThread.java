package com.lxk.designpatterns.StatePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 15:58
 */
public class TThread {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
