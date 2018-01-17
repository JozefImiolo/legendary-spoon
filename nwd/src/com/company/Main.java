package com.company;

public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.print("Usage: nwd a b");
            System.exit(1);
        }

        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int c;

        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }

        System.out.print(a);
    }
}
