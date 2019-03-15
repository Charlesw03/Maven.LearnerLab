package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    Instructor instructor0 = new Instructor(333L);
    Instructor instructor1 = new Instructor(332L);
    Instructor instructor2 = new Instructor(331L);
    Instructor[] instructorsArr = {instructor0, instructor1, instructor2};

    protected Instructors() {
        for (Instructor intsru : instructorsArr) {
            super.add(intsru);
        }
    }
    public static Instructors getInstance(){
            return INSTANCE;

    }


    @Override
    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }
}

