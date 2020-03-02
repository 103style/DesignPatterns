package com.lxk.designpatterns.FilterPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 14:32
 */
public class Person {
    private String name;
    private int gender;
    private int age;

    public Person(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public interface Gender {
        int MALE = 0;
        int FEMALE = 1;
    }
}
