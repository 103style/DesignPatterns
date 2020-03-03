package com.lxk.designpatterns.MementoPattern;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 14:31
 */
public class CareTaker {

    private List<Memento> mementos;
    private int index;
    private String gap = "--";

    public CareTaker() {
        mementos = new ArrayList<>();
        index = mementos.size();
    }

    public void add(Memento state) {
        if (index != mementos.size()) {
            mementos = mementos.subList(0, index);
        }
        mementos.add(state);
        index++;
    }

    /**
     * 撤销
     */
    public Memento ctrlZ() {
        System.out.println("do ctrlZ");
        if (index > 1) {
            index--;
        }
        return mementos.get(index - 1);
    }

    /**
     * 反撤销
     */
    public Memento ctrlShirtZ() {
        System.out.println("do ctrlShirtZ");
        if (index < mementos.size()) {
            index++;
        }
        return mementos.get(index - 1);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Memento memento : mementos) {
            builder.append(memento.getState()).append(gap);
        }
        return builder.toString();
    }

    public int getIndex() {
        return index;
    }

    public String getState() {
        return mementos.get(index - 1).getState();
    }
}
