package com.lxk.designpatterns.MediatorPattern;

import java.util.Date;

/**
 * @author https://github.com/103style
 * @date 2020/3/3 14:04
 */
public class ChatRoom {

    public static void showMessage(User user, String msg) {
        System.out.println(new Date().toString() + " " + user.name + ":" + msg);
    }
}
