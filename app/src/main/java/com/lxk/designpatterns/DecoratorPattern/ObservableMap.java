package com.lxk.designpatterns.DecoratorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 16:45
 */
public final class ObservableMap extends Observable {

    public ObservableMap(Runnable runnable) {
        //....
        runnable.run();
    }

    @Override
    public void subscribeActual(Observer observer) {
        try {
            observer.onNext();
            //....
            observer.onComplete();
        } catch (Exception e) {
            observer.onError();
        }
    }
}
