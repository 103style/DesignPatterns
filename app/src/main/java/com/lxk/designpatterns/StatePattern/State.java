package com.lxk.designpatterns.StatePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 15:50
 */
public interface State {

    int PREPARE = 1;

    int RUNNING = 2;

    int FINISHED = 3;

    /**
     * 状态对应的行为
     *
     * @param thread 测试线程
     */
    void doAction(TThread thread);

    /**
     * 当前状态
     */
    int getState();
}
