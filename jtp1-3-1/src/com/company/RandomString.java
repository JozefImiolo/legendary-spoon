package com.company;

import java.util.Random;

/**
 * Class RandomString
 */
public class RandomString {

    /**
     *
     */
    private static int instancesCount = 0;

    /**
     *
     */
    private String stringValue = "";

    /**
     *
     */
    RandomString() {
        setValue();
        instancesCount++;
    }

    /**
     * Get instances count
     * @return
     */
    public static int getInstancesCount() {
        return instancesCount;
    }

    /**
     * Set random value
     */
    private void setValue() {
        int strLength = 4 + (new Random()).nextInt(8);
        char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'A', 'B', 'C', 'D', 'E', 'F'};

        for (int i = 0; i < strLength; i++) {
            this.stringValue = (new StringBuilder()).append(characters[i]).toString();
        }
    }

    @Override
    public String toString() {
        return "RandomString value = " + this.stringValue;
    }
}
