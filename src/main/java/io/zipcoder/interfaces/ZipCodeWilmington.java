package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();


    public void hostLecture(Teacher teacher,double numberOfHours){

        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(Long instructorID,double numberOfHours){
          Instructor instructors1 =  instructors.findById(instructorID);
                    instructors1.lecture(students.stuArr,numberOfHours);
    }
}
