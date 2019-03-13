package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation() {
        //given when then
        Student stu = new Student(333l);
        Assert.assertTrue(stu instanceof LearnerInterface);


    }

    @Test
    public void testInheritance() {
        //given
        Student stu = new Student(222L);
        //when
        Assert.assertTrue(stu instanceof Person);
        //then

    }

    @Test
    public void testLearn() {
        //given
        Student stud = new Student(123l);
        Double expected = 11.0;
        //when
        stud.learn(11.0);
        Double actual = stud.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual);

    }

}
