package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	    EuclideanDistance dist = new EuclideanDistance();

        Vector<Double> v1 = new Vector<>();
        Vector<Double> v2 = new Vector<>();
        v1.add(0.0);
        v1.add(3.0);
        v2.add(0.0);
        v2.add(5.0);

        try {
            System.out.println(dist.distanceBetween(v1,v2));
        } catch (NotMatchingDimensionalityException e) {
            e.printStackTrace();
        }

        TaxiDistance taxi = new TaxiDistance();
        v1 = new Vector<>();
        v2 = new Vector<>();
        v1.add(0.0);
        v2.add(1.0);
        v1.add(2.0);
        v2.add(3.0);

        try {
            System.out.print(taxi.distanceBetween(v1,v2));
        } catch (NotMatchingDimensionalityException e) {
            e.printStackTrace();
        }
    }
}
