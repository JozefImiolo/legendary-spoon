package com.company;

public class Main {

    public static void main(String[] args) {
	    Double[] elements = {1.0, 2.0, 3.0, 4.0, 5.0};
	    Double[] elements2 = {1.0, 2.1, 3.0, 4.0, 5.0};

	    System.out.println(MathHelper.isArithmetic(elements));
	    System.out.println(MathHelper.isArithmetic(elements2));

	    elements = new Double[]{1.0, 2.0, 4.0, 8.0, 16.0};
	    elements2 = new Double[]{1.0, 2.0, 6.0, 8.0, 16.0};
        System.out.println(MathHelper.isGeometric(elements));
        System.out.print(MathHelper.isGeometric(elements2));

    }
}
