package com.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "persons")
@XmlAccessorType( XmlAccessType.FIELD)
public class Persons implements Serializable {
    @XmlElement(name = "Fullname")
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
