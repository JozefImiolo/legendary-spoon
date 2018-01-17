package com.company;

public class ComparisonProvider {
    public int compareByFirstName(Person p1, Person p2) {
        return p1.firstname.compareTo(p2.firstname);
    }

    public static int compareByLastName(Person p1, Person p2) {
        return p1.lastname.compareTo(p2.lastname);
    }
}
