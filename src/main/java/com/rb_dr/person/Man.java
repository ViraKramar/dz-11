package com.rb_dr.person;

import java.util.ArrayList;
import java.util.List;

public class Man extends Person {
    public Man(String firstName, String lastName, String previousLastName, int age, String hobby, Person partner) {
        super(firstName, lastName, previousLastName, age, hobby, partner);
    }

    private final List < Person > men = new ArrayList < > ();
    public void addMan(Person man) {
        men.add(man);
    }
    @Override
    public boolean isContain(Person man) {
        return men.contains(man);
    }

    @Override
    public boolean isRetired() {
        boolean isRetired = false;
        for (Person person: men) {
            if (person.getAge() > 65) {
                isRetired = true;
            } else {
                isRetired = false;
            }
        }
        return isRetired;
    }

    @Override
    public String getBadgeActive() {
        String result = "";
        for (Person person: men) {
            if (person.getHobby().equals("Fishing")) {
                result = person.getFirstName() + " has got Relax Badge!";
            } else result = person.getFirstName() + " has not Relax Badge yet";
        }
        return result;
    }
}