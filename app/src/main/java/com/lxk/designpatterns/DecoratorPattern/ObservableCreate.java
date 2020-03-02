package com.lxk.designpatterns.DecoratorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 16:37
 */
public final class ObservableCreate extends Observable {

    public ObservableCreate(Runnable runnable) {
        //....
        runnable.run();
    }

    @Override
    protected void subscribeActual(Observer observer) {
        try {
            observer.onNext();
            //....
            observer.onComplete();
        } catch (Exception e) {
            observer.onError();
        }
    }
}
