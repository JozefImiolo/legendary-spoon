package com.company;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class SerializableCounter {

    /**
     *
     * @param list
     * @return
     */
    public static int count(List<?> list) {
        int counter = 0;
        for (Object element : list) {
            if(element instanceof Serializable)
                counter++;
        }

        return counter;
    }
}
