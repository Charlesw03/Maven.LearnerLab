package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void testConstructor(){
        //given
        Long expected = 333333L;
        Person person = new Person(expected);
        //when
        Long actual = person.getId();
        //then
        Assert.assertEquals(expected,actual);

    }



    @Test
    public  void testSetName(){
        //given
        String expected = "Kratos";
        Person person = new Person(333333L);
        //when
           person.setName(expected);
           String actual = person.getName();
        //then
        Assert.assertEquals(expected,actual);
    }

}
