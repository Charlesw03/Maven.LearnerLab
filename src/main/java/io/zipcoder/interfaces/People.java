package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class People<T extends Person> {
    private Long id;

    List<T> personList = new ArrayList<>();


    public void add(T person) {
        personList.add(person);
    }

    public T findById(Long id) {
        for (T pers : personList) {
            if (pers.getId().equals(id)) {
                return pers;
            }
            //break;
        }

        return null;
    }


    public void remove(T person) {
        for (T pers : personList) {
            if (pers == person) {
                personList.remove(person);
            }
        }
    }

    public void remove(Long id) {
        for (T person : personList) {
            if (person.getId() == id) {
                personList.remove(id);
            }
        }

    }

    public Integer getCount() {
        return personList.size();
    }

    public abstract T[] toArray();




    public void removeAll() {
        personList.removeAll(personList);

    }

}
