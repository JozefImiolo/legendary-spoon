package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // 1 - ArrayList
        long time = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10e6; i++) {
            list.add(1);
        }
        System.out.println((System.currentTimeMillis() - time));

        // 2 - ArrayList
        time = System.currentTimeMillis();
        ArrayList<Integer> list2 = new ArrayList<Integer>((int)10e6);
        for (int i = 0; i < 10e6; i++) {
            list2.add(1);
        }
        System.out.println((System.currentTimeMillis() - time));

        // 3 - Linked list
        time = System.currentTimeMillis();
        LinkedList<Integer> list3 = new LinkedList<Integer>();
        for (int i = 0; i < 10e6; i++) {
            list3.add(1);
        }
        System.out.println((System.currentTimeMillis() - time));
    }
}
