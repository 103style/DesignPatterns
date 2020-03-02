package com.lxk.designpatterns.CompositePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 15:53
 */
public class ImageFile extends AbsFile {

    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("image file :" + name);
    }
}
