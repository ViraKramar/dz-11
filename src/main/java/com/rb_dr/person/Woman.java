package com.rb_dr.person;

import java.util.ArrayList;
import java.util.List;
public class Woman extends Person {
    public Woman(String firstName, String lastName, String previousLastName, int age, String hobby, Person partner) {
        super(firstName, lastName, previousLastName, age, hobby, partner);
    }
    private final List < Person > women = new ArrayList < > ();
    public void addWoman(Person woman) {
        women.add(woman);
    }

    @Override
    public boolean isContain(Person woman) {
        return women.contains(woman);
    }

    @Override
    public boolean isRetired() {
        boolean isRetired = false;
        for (Person person: women) {
            if (person.getAge() > 60) {
                isRetired = true;
            } else {
                isRetired = false;
            }
        }
        return isRetired;
    }
    public String registerPartnership() {
        String newLastName = "";
        for (Person person: women) {
            if (person.getPartner() != null) {
                newLastName = person.setLastName(getPartner().getLastName());
            }
        }
        return newLastName;
    }
    @Override
    public String getBadgeActive() {
        String result = "";
        for (Person person: women) {
            if (person.getHobby().equals("Running")) {
                result = person.getFirstName() + " has got Active Badge!";
            } else result = person.getFirstName() + " has not Active Badge yet";
        }
        return result;
    }
    public String deregisterPartnership(boolean deregisterPartnership) {
        String result = "";
        for (Person person: women) {
            if (deregisterPartnership) {
                result = person.setLastName(getPreviousLastName());
            } else {
                result = person.getLastName();
            }
        }
        return result;
    }
}