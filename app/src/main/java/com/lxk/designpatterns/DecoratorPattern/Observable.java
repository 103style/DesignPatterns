package com.lxk.designpatterns.DecoratorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 16:39
 */
public abstract class Observable {
    public static Observable create(Runnable runnable) {
        return new ObservableCreate(runnable);
    }

    public static Observable map(Runnable runnable) {
        return new ObservableMap(runnable);
    }

    /**
     * 订阅
     */
    protected abstract void subscribeActual(Observer observer);
}
