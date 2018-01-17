package com.company;

import sun.reflect.generics.tree.Tree;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("assets/book.txt")), StandardCharsets.UTF_8);
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : text.split(" ")) {
            if(!map.containsKey(word))
            {
                map.put(word, 0);
            }

            map.replace(word, map.get(word) + 1);
        }

        TreeMap<String, Integer> sortedMap = sortMapByValue(map);

        int x = 0;
        for(String key: sortedMap.keySet()){
            if(x == 50) break;
            System.out.println(key);
            x++;
        }


    }

    public static TreeMap<String, Integer> sortMapByValue(HashMap<String, Integer> map){
        Comparator<String> comparator = new ValueComparator(map);
        //TreeMap is a map sorted by its keys.
        //The comparator is used to sort the TreeMap by keys.
        TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
        result.putAll(map);
        return result;
    }
}
