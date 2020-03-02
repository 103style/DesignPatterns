package com.lxk.designpatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 15:50
 */
public class Folder extends AbsFile {
    List<AbsFile> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    public void add(AbsFile file) {
        files.add(file);
    }

    @Override
    public void display() {
        System.out.println("Folder name is " + name);
        for (AbsFile file : files) {
            file.display();
        }
    }
}
