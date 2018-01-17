package com.company;

/**
 *
 */
public class NotMatchingDimensionalityException extends Exception {
    /**
     *
     * @return
     */
    @Override
    public String getMessage() {
        return "Vectors have different dimensions!";
    }
}
