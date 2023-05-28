package com.rb_dr.person;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String previousLastName;
    private int age;
    private String hobby;

    private Person partner;

    public String getPreviousLastName() {
        return previousLastName;
    }

    public void setPreviousLastName(String previousLastName) {
        this.previousLastName = previousLastName;
    }

    public Person(String firstName, String lastName, String previousLastName, int age, String hobby, Person partner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.previousLastName = previousLastName;
        this.age = age;
        this.hobby = hobby;
        this.partner = partner;
    }

    public abstract boolean isContain(Person person);
    public abstract boolean isRetired();
    public abstract String getBadgeActive();

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {

        this.age = age;
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String setHobby(String hobby) {
        this.hobby = hobby;
        return hobby;
    }

    public Person getPartner() {
        return partner;
    }

    public Person setPartner(Person partner) {
        this.partner = partner;
        return partner;
    }
}