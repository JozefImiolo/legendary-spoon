package com.company;

public class Main {

    public static void main(String[] args) {
        Integer myInt = 7;
        String myString = "asd";

	    Pair<Integer, String> myPair = new Pair<>(myInt, myString);
	    System.out.print(myPair.getFirst() + " " + myPair.getSecond());
    }
}
