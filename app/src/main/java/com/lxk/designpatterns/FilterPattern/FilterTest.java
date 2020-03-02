package com.lxk.designpatterns.FilterPattern;

import com.lxk.designpatterns.FilterPattern.imp.AdultFilter;
import com.lxk.designpatterns.FilterPattern.imp.FemaleFilter;
import com.lxk.designpatterns.FilterPattern.imp.FreeFilter;
import com.lxk.designpatterns.FilterPattern.imp.MaleFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 14:43
 */
public class FilterTest {
    public static void main(String[] args) {
        List<Person> test = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            test.add(new Person("name" + i, i % 2, i));
        }
        AdultFilter adultFilter = new AdultFilter();
        FemaleFilter femaleFilter = new FemaleFilter();
        MaleFilter maleFilter = new MaleFilter();
        FreeFilter freeFilter = new FreeFilter();

        System.out.println("adults count: " + adultFilter.filter(test).size());
        System.out.println("female adults count: " + femaleFilter.filter(adultFilter.filter(test)).size());
        System.out.println("male adults count: " + maleFilter.filter(adultFilter.filter(test)).size());
        System.out.println("free count:" + freeFilter.filter(test).size());
    }
}
