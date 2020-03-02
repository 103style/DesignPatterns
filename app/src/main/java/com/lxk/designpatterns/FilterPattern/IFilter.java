package com.lxk.designpatterns.FilterPattern;

import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 14:35
 */
public interface IFilter {
    /**
     * 过滤条件
     */
    List<Person> filter(List<Person> persons);
}
