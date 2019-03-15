package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors() {
        Instructor instructor = new Instructor(333L);
        Instructors instructors = Instructors.getInstance();
        instructors.add(instructor);
        Integer expected = 4;
        Integer actual = instructors.personList.size();

        Assert.assertEquals(expected, actual);


    }


}
