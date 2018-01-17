package com.company;

public class Person {
    public String firstname;
    public String lastname;
    public int age;

    Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}
