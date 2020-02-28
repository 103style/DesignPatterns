package com.lxk.designpatterns.PrototypePattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/28 10:25
 */
public class PrototypeTest {

    public static void main(String[] args) {
        SheepCache.loadCache();

        AbsSheep clonedSheep = SheepCache.getSheep(1);
        System.out.println("i am sheep " + clonedSheep.name);

        clonedSheep = SheepCache.getSheep(2);
        System.out.println("i am sheep " + clonedSheep.name);

        clonedSheep = SheepCache.getSheep(3);
        System.out.println("i am sheep " + clonedSheep.name);
    }
}
