package com.lxk.designpatterns.NullObjectPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 16:27
 */
public class MaidFactory {
    public static final String[] names = {"Kim", "Puff", "Jessica"};

    public static AbsMaid getMaid(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new MaidReal(name);
            }
        }
        return new MaidNull();
    }
}
