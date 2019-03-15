package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id) {

        super(id);
    }



    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

        double numberOfHOursPerLearner = numberOfHours / learners.length;
        for (Learner obj : learners) {
            obj.learn(numberOfHOursPerLearner);
        }
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }
}
