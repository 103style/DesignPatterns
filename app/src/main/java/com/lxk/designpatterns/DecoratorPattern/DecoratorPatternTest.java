package com.lxk.designpatterns.DecoratorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 16:52
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Observable
                .create(() -> {
                    System.out.println("create operation");
                })
                .map(() -> {
                    System.out.println("map operation");
                })
                .subscribeActual(new Observer() {
                    @Override
                    public void onNext() {
                        System.out.println("onNext");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("onComplete");
                    }

                    @Override
                    public void onError() {
                        System.out.println("onError");
                    }
                });
    }
}
