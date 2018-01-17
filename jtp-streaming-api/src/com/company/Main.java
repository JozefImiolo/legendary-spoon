package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Jan", "Kowalski", 1),
                new Person("Robert", "Pec", 2),
                new Person("Olaf", "Kowalkiewicz", 3),
                new Person("Wojciech", "Nowacki", 4));

        Collections.sort(people, (pa, pb) -> pa.lastname.length() - pb.lastname.length());
        System.out.println(people);

        Collections.sort(people, (pa, pb) -> pa.firstname.length() - pb.firstname.length());
        System.out.println(people);

        Collections.sort(people, ComparsionProvider::compareByFirstName);
        System.out.println(people);

        people.forEach(System.out::println);
        people.forEach(p -> System.out.println(p.firstname));
        System.out.println();

        System.out.println(people.stream().filter(p -> p.firstname.startsWith("J")).count());
        System.out.println(people.stream().filter(p -> p.firstname.startsWith("J")).count());
    }
}
