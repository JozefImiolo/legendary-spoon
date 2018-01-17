package com.company;

import java.util.ArrayList;

/**
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer a = 3;
        String str = "sd";
        Person p = new Person();

        ArrayList<Object> list = new ArrayList<>();
        list.add(a);
        list.add(str);
        list.add(p);
        System.out.println("Elements count: " + list.size());
        System.out.print("Serializable count: " + SerializableCounter.count(list));
    }
}
