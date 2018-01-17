package com.company;

import java.util.Vector;

public interface DistanceInterface {
    public <T extends Number> T distanceBetween(Vector<T> vector1, Vector<T> vector2) throws NotMatchingDimensionalityException;
}
