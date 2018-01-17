package com.company;

/**
 * Class com.company.MathHelper
 */
public class MathHelper {

    /**
     * Zero const
     */
    public static final int ZERO = 0;

    /**
     * One const
     */
    public static final int ONE = 1;

    /**
     * Pi
     */
    public static final double PI = Math.PI;

    /**
     * E
     */
    public static final double E = Math.E;

    /**
     * Checks if series are arithmetic
     *
     * @param elements
     * @return
     */
    public static boolean isArithmetic(Double[] elements) {
        for (int i = 0; i < elements.length - 3; i++) {
            if (elements[i + 1] - elements[i] != elements[i + 2] - elements[i + 1])
                return false;
        }

        return true;
    }

    /**
     * Is series geometric
     *
     * @param elements
     * @return
     */
    public static boolean isGeometric(Double[] elements) {
        for (int i = 0; i < elements.length - 3; i++) {
            if (elements[i + 1] / elements[i] != elements[i + 2] / elements[i + 1])
                return false;
        }

        return true;
    }

    public static Double harmonicAverage(Double[] elements) {

    }
}
