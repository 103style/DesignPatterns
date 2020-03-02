package com.lxk.designpatterns.FacadePattern.imp;

import com.lxk.designpatterns.FacadePattern.IInit;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 17:17
 */
public class IMComponent implements IInit {
    @Override
    public void init() {
        System.out.println("im component init!");
    }
}
