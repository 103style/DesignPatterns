package com.lxk.designpatterns.StatePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 15:55
 */
public class StateRunning implements State {
    @Override
    public void doAction(TThread thread) {
        thread.setState(this);
        System.out.println("Thread is in running state");
    }

    @Override
    public int getState() {
        return State.RUNNING;
    }
}
