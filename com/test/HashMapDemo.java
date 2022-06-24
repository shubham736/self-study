package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] arguments) {
        // creating hash_map.
        Map<Integer, String> hash_map = new HashMap<>();
        // inserting sets in the hash_map.
        hash_map.put(1, "Thor");
        hash_map.put(2, "Iron man");
        // iterating it using forEach.
        hash_map.forEach((key,value) -> System.out.println(key + " = " + value));


        for (Map.Entry<Integer, String> set : hash_map.entrySet()) {
            System.out.println(set.getKey() + " = " + set.getValue());
        }


        Iterator<Map.Entry<Integer, String>> it = hash_map.entrySet().iterator();
        // iterating every set of entry in the HashMap.
        while (it.hasNext()) {
            Map.Entry<Integer, String> set = it.next();
            System.out.println(set.getKey() + " = " + set.getValue());
        }


        TreeMap<String,String> treemap=new TreeMap<String,String>();
//we can take anything in the key such as integer, string, etc.
//adding elements to the TreeMap
        treemap.put("H","Ahmedabad ");
        treemap.put("D","Jaipur");
        treemap.put("B","Delhi");
        treemap.put("F","Agra");
        treemap.put("P","Patna");
//for-each loop for fetching the elements from the TreeMap
        for(Map.Entry m:treemap.entrySet())
        {
//prints the key and value pair of the elements
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}