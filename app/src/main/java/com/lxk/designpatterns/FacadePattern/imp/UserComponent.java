package com.lxk.designpatterns.FacadePattern.imp;

import com.lxk.designpatterns.FacadePattern.IInit;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 17:15
 */
public class UserComponent implements IInit {
    @Override
    public void init() {
        System.out.println("user component init!");
    }
}
