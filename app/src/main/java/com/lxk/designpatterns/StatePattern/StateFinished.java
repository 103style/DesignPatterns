package com.lxk.designpatterns.StatePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 15:55
 */
public class StateFinished implements State {
    @Override
    public void doAction(TThread thread) {
        thread.setState(this);
        System.out.println("Thread is in finished state");
    }

    @Override
    public int getState() {
        return State.FINISHED;
    }
}
