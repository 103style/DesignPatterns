package com.lxk.designpatterns.StatePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 16:00
 */
public class StatePatternTest {

    public static void main(String[] args) {

        TThread t = new TThread();

        StatePrepare statePrepare = new StatePrepare();
        statePrepare.doAction(t);
        System.out.println(t.getState().getState());

        StateRunning stateRunning = new StateRunning();
        stateRunning.doAction(t);
        System.out.println(t.getState().getState());


        StateFinished stateFinished = new StateFinished();
        stateFinished.doAction(t);
        System.out.println(t.getState().getState());
    }
}
