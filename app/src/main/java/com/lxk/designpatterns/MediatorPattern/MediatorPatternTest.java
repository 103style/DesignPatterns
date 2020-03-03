package com.lxk.designpatterns.MediatorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 14:06
 */
public class MediatorPatternTest {

    public static void main(String[] args) {
        User john = new User("John");
        User robot = new User("Robot");
        john.sendMsg("Hi, what's your name?");
        robot.sendMsg("Hi! my name is 103style, and you?");
        john.sendMsg("you can call me John.");
        robot.sendMsg("Oh, Nice to meet you! John.");
        john.sendMsg("Nice to meet you too! 103style.");
    }
}
