package com.company;

import java.util.Vector;

/**
 *
 */
public class TaxiDistance<T extends Number> implements DistanceInterface {

    /**
     *
     * @param vector1
     * @param vector2
     * @param <T>
     * @return
     * @throws NotMatchingDimensionalityException
     */
    @Override
    public <T extends Number> T distanceBetween(Vector<T> vector1, Vector<T> vector2) throws NotMatchingDimensionalityException {
        if(vector1.size() != vector2.size()) {
            throw new NotMatchingDimensionalityException();
        }

        Number distance = 0.0;
        for(int x = 0; x < vector1.size(); x++) {
            distance = distance.intValue() + Math.abs(vector1.get(x).intValue() - vector2.get(x).intValue());
        }

        return ((T) distance);
    }
}
