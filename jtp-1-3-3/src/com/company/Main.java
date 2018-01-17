package com.company;

public class Main {

    public static void main(String[] args) {
        Double[][] points = {{0.0, 0.0}, {Math.sqrt(2.0), Math.sqrt(2.0)}};
        System.out.print((new EuclidesDistance()).getDistance(points));
    }
}
