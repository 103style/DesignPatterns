package com.lxk.designpatterns.CompositePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 15:53
 */
public class TextFile extends AbsFile {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("text file:" + name);
    }
}
