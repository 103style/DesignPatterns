package com.lxk.softwaredesignpatterndemos.FactoryPattern.goods;

import com.lxk.softwaredesignpatterndemos.FactoryPattern.IGoods;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 15:30
 * 1.5L的水
 */
public class Water implements IGoods {
    @Override
    public float prices() {
        return 3.0F;
    }
}
