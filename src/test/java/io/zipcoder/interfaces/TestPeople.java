package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestPeople {
    @Test
    public void testAdd() {
        //given
        Integer expected = 2;
        Person person0 = new Person(231l);
        Person person = new Person(123l);
        List<Person> newlist = new ArrayList<>();
        //when
        newlist.add(person);
        newlist.add(person0);
        Integer actual = newlist.size();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        Integer expected = 0;
        Person person0 = new Person(231l);
        Person person = new Person(123l);
        List<Person> newlist = new ArrayList<>();
        //when
        newlist.add(person);
        newlist.add(person0);
        newlist.removeAll(newlist);
        Integer actual = newlist.size();
        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testFindById() {
        //given
        Person person = new Person(123l);
        Long expected = 123l;
        Long actual = person.getId();
        Assert.assertEquals(expected,actual);

}


}
