package com.company;

import java.util.Vector;

/**
 *
 */
public class EuclideanDistance implements DistanceInterface {

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

        return (T)(Number)(Math.sqrt(Math.pow(vector2.get(0).doubleValue() - vector1.get(0).doubleValue(), 2)
                + Math.pow(vector2.get(1).doubleValue() - vector1.get(1).doubleValue(),2)));
    }

}
