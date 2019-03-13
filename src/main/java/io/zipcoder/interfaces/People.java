package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    private Long id;

    List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(Long id) throws Exception {
        for (Person pers : personList) {
            if (pers.getId() == id) {
                return pers;
            }
        }

        throw new Exception();
    }


    public void remove(Person person) {
        for (Person pers : personList) {
            if (pers == person) {
                personList.remove(person);
            }
        }
    }

    public void remove(Long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                personList.remove(id);
            }
        }

    }

    public Integer getCount() {
        return personList.size();
    }

    public Object[] toArray() {

        return personList.toArray();
    }



    public void removeAll(){
        personList.removeAll(personList);

    }

}
