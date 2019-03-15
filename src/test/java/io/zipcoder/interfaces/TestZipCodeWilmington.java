package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture() {
        //given
    ZipCodeWilmington zcw = new ZipCodeWilmington();
        Students students = Students.getInstance();
        Instructors instructors = Instructors.getInstance();
            Double numberOfHours = 30.0;
               Double expected = 10.0;
        //when
        zcw.hostLecture(333L, numberOfHours);
        Double actual = students.student.getTotalStudyTime();

       Assert.assertEquals(expected,actual);

    }


}
