package com.lxk.designpatterns.MediatorPattern;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 14:04
 */
public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMsg(String msg) {
        ChatRoom.showMessage(this, msg);
    }
}
