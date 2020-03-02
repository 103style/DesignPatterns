package com.lxk.designpatterns.FilterPattern.imp;

import com.lxk.designpatterns.FilterPattern.IFilter;
import com.lxk.designpatterns.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 14:39
 */
public class FemaleFilter implements IFilter {

    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> res = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender() == Person.Gender.FEMALE) {
                res.add(person);
            }
        }
        return res;
    }
}
