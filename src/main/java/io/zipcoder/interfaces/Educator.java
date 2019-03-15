package io.zipcoder.interfaces;

public enum  Educator implements Teacher {
    LEON,
    FROILAN,
    KRIS;

    private final Instructor instructor;
    private Double numberOfHoursTaught = 0.0;

    Educator(){
    this.instructor = new Instructor((long) ordinal());

    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.numberOfHoursTaught+=numberOfHours;
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
            instructor.lecture(learners , numberOfHours);
            numberOfHoursTaught+=numberOfHours;
    }
}
