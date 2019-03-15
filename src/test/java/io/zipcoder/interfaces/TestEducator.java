package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {
    @Test
    public void testImplementation() {
        //given
        Instructor ins = new Instructor(111L);
        Assert.assertTrue(ins instanceof Teacher);

    }

    @Test
    public void testInheritance() {
        Instructor ins = new Instructor(222L);
        Assert.assertTrue(ins instanceof Person);

    }

    @Test
    public void testTeach() {
        Instructor ins = new Instructor(333L);
        Student learner = new Student(222l);
        Double numberOfHours = 10.0;
        ins.teach(learner, numberOfHours);

        Double actual = learner.getTotalStudyTime();
        Assert.assertEquals(numberOfHours,actual);
    }
    @Test
    public void testLecture() {
        Instructor ins = new Instructor(4444l);
        Student stu = new Student(123l);
        Learner[] students = new Learner[]{stu, stu, stu, stu, stu};
        Double expected = 10.0;
        ins.lecture(students, 10);
        Double actual = stu.getTotalStudyTime();
        Assert.assertEquals(expected,actual);



}}
