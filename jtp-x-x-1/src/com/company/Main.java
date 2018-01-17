package com.company;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class Main {

    /**
     *
     * @param list
     * @return
     */
    public static Map<Serializable, Integer> getFrequenciesWildcard(List<? extends Serializable> list) {
        Map<Serializable, Integer> map = new HashMap<>();

        for (Serializable element : list) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }

        return map;
    }

    /**
     *
     * @param list
     * @return
     */
    public static double avg(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }

        return sum/list.size();
    }

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("asd", "dsa", "asd", "123", "asd", "dsa");
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 1, 2, 3);

        System.out.println(getFrequenciesWildcard(listOfStrings).toString());
        System.out.println(getFrequenciesWildcard(listOfIntegers).toString());
        System.out.println("");

        List<Integer> listOfIntegers2 = Arrays.asList(1,2,3,4,5,56,7,7,5);
        List<Float> listOfFloats = Arrays.asList(1.23f, 3.0f, 2f, 6.67675f, 3.14f);
        System.out.println(avg(listOfIntegers2));
        System.out.println(avg(listOfFloats));
    }
}
