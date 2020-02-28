package com.lxk.designpatterns.FactoryPattern;

/**
 * @author https://github.com/103style
 * @date 2020/2/25 15:25
 * <p>
 * 商品的抽象接口
 */
public interface IGoods {
    /**
     * 返回商品价格
     *
     * @return 商品价格
     */
    float prices();
}
