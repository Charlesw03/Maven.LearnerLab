package io.zipcoder.interfaces;

public class Students extends People<Student> {
    // capitalize things that are final
    private static final Students INSTANCE = new Students();
    Student student = new Student(123l);
    Student student1 = new Student(223l);
    Student student2 = new Student(321l);
    Student[] stuArr = {student, student1, student2};


    private Students() {
        for (Student stu : stuArr) {
            super.add(stu);
        }
    }

    public static Students getInstance() {
        return INSTANCE;

    }

    @Override
    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }
}
