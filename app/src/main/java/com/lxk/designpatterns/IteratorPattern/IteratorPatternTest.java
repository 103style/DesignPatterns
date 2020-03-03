package com.lxk.designpatterns.IteratorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 13:32
 */
public class IteratorPatternTest {

    public static void main(String[] args) {
        ShapeRepository shapeRepository = new ShapeRepository();

        IIterator iIterator = shapeRepository.iterator();
        while (iIterator.hasNext()) {
            System.out.println(iIterator.next());
        }
    }
}
