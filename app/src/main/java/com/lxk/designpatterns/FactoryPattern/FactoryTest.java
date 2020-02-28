package com.lxk.designpatterns.FactoryPattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 15:37
 * 工厂模式的测试
 *
 * 模拟去采购的场景
 */
public class FactoryTest {

    public static void main(String[] args) {
        String[] needBug = {
                GoodsFactory.GoodsList.BEEF,
                GoodsFactory.GoodsList.CELERY,
                GoodsFactory.GoodsList.MANGO,
                GoodsFactory.GoodsList.WATER
        };
        GoodsFactory factory = new GoodsFactory();
        float moneyCost = 0;
        for (String goods : needBug) {
            moneyCost += factory.getGoods(goods).prices();
        }
        System.out.println(String.format("you need pay ￥%.2f!", moneyCost));
    }
}
