package com.company;

import com.company.interfaces.DistanceCalculable;

/**
 *
 */
public class EuclidesDistance implements DistanceCalculable {

    /**
     * Get distance between two points
     * @param points
     * @return
     */
    @Override
    public double getDistance(Double[][] points) {
        return Math.sqrt(
                Math.pow(points[0][0] - points[1][0],2) +
                Math.pow(points[0][1] - points[1][1],2)
        );
    }
}
