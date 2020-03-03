package com.lxk.designpatterns.IteratorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 13:21
 */
public class ShapeRepository implements IContainer {
    public String[] shapeArr = {"circle", "angle", "rectangle", "pot"};

    @Override
    public IIterator iterator() {
        return new ShapeIterator();
    }

    private class ShapeIterator implements IIterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < shapeArr.length;
        }

        @Override
        public Object next() {
            Object o = shapeArr[index];
            index++;
            return o;
        }
    }
}
