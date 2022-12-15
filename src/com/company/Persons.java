package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Persons implements Serializable {
    private List<Person> persons= new ArrayList<>();

    public Persons() {
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
public void addPerson(Person person) {
    persons.add(person);
}
}
