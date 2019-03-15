package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class testStudents {
    @Test
    public void testStudents(){
        //given
       Students stu = Students.getInstance();
        //when
        Assert.assertTrue(stu.findById(123l) instanceof Student);
        //then

    }
}
