package com.lxk.designpatterns.CompositePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 15:48
 */
public abstract class AbsFile {

    String name;

    public AbsFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
