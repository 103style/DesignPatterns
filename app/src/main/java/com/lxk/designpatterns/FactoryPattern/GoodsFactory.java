package com.lxk.designpatterns.FactoryPattern;

import com.lxk.designpatterns.FactoryPattern.goods.Beef;
import com.lxk.designpatterns.FactoryPattern.goods.Celery;
import com.lxk.designpatterns.FactoryPattern.goods.Mango;
import com.lxk.designpatterns.FactoryPattern.goods.Water;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 15:32
 * 商品工厂类
 */
public class GoodsFactory {
    public IGoods getGoods(String name) {
        IGoods goods = null;
        switch (name) {
            case GoodsList.BEEF:
                goods = new Beef();
                break;
            case GoodsList.CELERY:
                goods = new Celery();
                break;
            case GoodsList.WATER:
                goods = new Water();
                break;
            case GoodsList.MANGO:
                goods = new Mango();
                break;
            default:
                break;
        }
        return goods;
    }

    public interface GoodsList {
        String WATER = "water";
        String CELERY = "celery";
        String BEEF = "beef";
        String MANGO = "mango";
    }
}
