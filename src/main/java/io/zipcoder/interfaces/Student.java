package io.zipcoder.interfaces;

public class Student extends Person implements LearnerInterface {
    private Double totalStudyTime;


    public Student(Long id) {
        super(id);
        this.totalStudyTime = 0.00;
    }

    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }


    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }


}
