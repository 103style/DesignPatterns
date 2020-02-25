package com.lxk.softwaredesignpatterndemos.FactoryPattern.goods;

import com.lxk.softwaredesignpatterndemos.FactoryPattern.IGoods;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 15:27
 * 芒果的价格
 */
public class Mango implements IGoods {
    @Override
    public float prices() {
        return 8.88F;
    }
}
