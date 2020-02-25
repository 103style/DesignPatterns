package com.lxk.softwaredesignpatterndemos.FactoryPattern.goods;

import com.lxk.softwaredesignpatterndemos.FactoryPattern.IGoods;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 15:31
 * 芹菜
 */
public class Celery implements IGoods {
    @Override
    public float prices() {
        return 2.48F;
    }
}
