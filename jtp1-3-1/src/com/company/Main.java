package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Class Main
 */
public class Main {

    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int x = 0; x < n; x++) {
            System.out.println(new RandomString().toString());
        }

        System.out.println("Instances count: "+RandomString.getInstancesCount());
    }
}
