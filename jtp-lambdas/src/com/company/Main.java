package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Person[] persons = {new Person("Jan", "Kowalski", 1), new Person("Andrzej", "Zima", 2)};
        Comparator<Person> compA = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.firstname.compareTo(p2.firstname);
            }
        };

        Comparator<Person> compB = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.lastname.compareTo(p2.lastname);
            }
        };

        Comparator<Person> compC = (p1, p2) -> p1.firstname.compareTo(p2.firstname);

        Arrays.sort(persons, ComparisonProvider::compareByLastName);
        System.out.println(Arrays.toString(persons));

        ComparisonProvider comparisonProvider = new ComparisonProvider();
        Arrays.sort(persons, comparisonProvider::compareByFirstName);
        System.out.println(Arrays.toString(persons));

    }
}
