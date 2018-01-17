package com.company;

import com.company.interfaces.DistanceCalculable;

public class TaxicabDistance implements DistanceCalculable {
    @Override
    public double getDistance(Double[][] points) {
        Double distance = 0.0;

        for (int i = 0; i < points[0].length; i++) {
            distance += Math.abs(points[0][i] - points[1][i]);
        }

        return distance;
    }
}
