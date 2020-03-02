package com.lxk.designpatterns.FilterPattern.imp;

import com.lxk.designpatterns.FilterPattern.IFilter;
import com.lxk.designpatterns.FilterPattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author https://github.com/103style
 * @date 2020/3/2 14:41
 */
public class MaleFilter implements IFilter {

    @Override
    public List<Person> filter(List<Person> persons) {
        List<Person> res = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender() == Person.Gender.MALE) {
                res.add(person);
            }
        }
        return res;
    }
}
