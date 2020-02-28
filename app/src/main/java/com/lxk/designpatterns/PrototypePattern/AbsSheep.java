package com.lxk.designpatterns.PrototypePattern;

import androidx.annotation.NonNull;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 10:01
 * 🐏羊的抽象类
 */
public abstract class AbsSheep implements Cloneable {
    public String name;
    private int id;

    public abstract void say();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
