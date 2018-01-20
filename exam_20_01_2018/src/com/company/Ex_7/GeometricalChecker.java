package com.company.Ex_7;

public class GeometricalChecker {
    public static boolean isGeometrical(Double... elements) {
        if (elements.length < 2) {
            return false;
        }

        if(elements.length == 2) {
            return true;
        }

        for(int x = 2; x < elements.length; x++) {
            if(elements[x-2] / elements[x-1] != elements[x-1]/elements[x]) {
                return false;
            }
        }

        return true;
    }
}
