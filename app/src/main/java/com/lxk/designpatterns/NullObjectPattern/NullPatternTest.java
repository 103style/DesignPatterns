package com.lxk.designpatterns.NullObjectPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 16:30
 */
public class NullPatternTest {
    public static void main(String[] args) {
        AbsMaid customer1 = MaidFactory.getMaid("Kim");
        AbsMaid customer2 = MaidFactory.getMaid("Puff");
        AbsMaid customer3 = MaidFactory.getMaid("Jessica");
        AbsMaid customer4 = MaidFactory.getMaid("Laura");

        System.out.println("Maids:");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
