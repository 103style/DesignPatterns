package com.lxk.designpatterns.FactoryPattern.goods;

import com.lxk.designpatterns.FactoryPattern.IGoods;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 15:27
 * 牛肉的价格
 */
public class Beef implements IGoods {

    @Override
    public float prices() {
        return 66.66F;
    }
}
