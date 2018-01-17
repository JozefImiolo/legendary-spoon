package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.print(nww(192.0, 348.0));
    }

    static double nww(double... numbers) {
        if (numbers.length == 2) {
            return (numbers[0] * numbers[1]) / nwd(numbers[0], numbers[1]);
        }

        return nww(Arrays.copyOfRange(numbers, 1, numbers.length));
    }

    static double nwd(double a, double b) {
        double c;

        while(b!=0) {
            c = a%b;
            a = b;
            b = c;
        }

        return a;
    }
}
