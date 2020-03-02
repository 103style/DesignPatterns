package com.lxk.designpatterns.CompositePattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 15:54
 */
public class CompositePatternTest {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        TextFile textFile = new TextFile("text.txt");
        VideoFile videoFile = new VideoFile("video.mp4");
        Folder subFile = new Folder("sub folder");
        root.add(textFile);
        root.add(videoFile);
        root.add(subFile);

        ImageFile imageFile = new ImageFile("image.png");
        subFile.add(imageFile);

        root.display();
    }
}
