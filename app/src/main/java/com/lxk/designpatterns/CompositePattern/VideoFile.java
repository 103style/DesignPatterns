package com.lxk.designpatterns.CompositePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 15:52
 */
public class VideoFile extends AbsFile {

    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("video file:" + name);
    }
}
