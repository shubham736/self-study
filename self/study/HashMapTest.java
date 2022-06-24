package self.study;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapTest {
    public static void main(String[] args) {

/*      HashMap<String  ,Integer> hashMap = new HashMap<>();
        hashMap.put("vikas",2);
        hashMap.put("shubham",3);
        hashMap.put("abhishek",1);
        for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
            System.out.println("Key :- "+entry.getKey() + " "+ "Value :- "+entry.getValue());
        }
 */

        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("======Before Sorting=========");
        map.put(33, 2);
        map.put(11, 3);
        map.put(22, 1);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key :- " + entry.getKey() + " " + "Value :- " + entry.getValue());
        }
        System.out.println("======After Sorting=========");
        //  sortByKey(map);
        sortByValue(map);
    }

    private static void sortByKey(HashMap<Integer, Integer> map) {
        // method 1
    /*    TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        for(Map.Entry<Integer,Integer> entry : treeMap.entrySet()){
            System.out.println("Key :- "+entry.getKey() + " "+ "Value :- "+entry.getValue());
        }*/

        // method 2
/*        TreeMap<Integer,Integer> sorted = new TreeMap<>(map);
        for(Map.Entry<Integer,Integer> entry : sorted.entrySet()){
            System.out.println("Key :- "+entry.getKey() + " "+ "Value :- "+entry.getValue());
        }*/

/*
        // method 3
        ArrayList<Integer> arrayList = new ArrayList<>(map.keySet());
        Collections.sort(arrayList);
        for(Integer integer : arrayList){
            System.out.println("Key :- "+integer + " "+ "Value :- "+map.get(integer));
        }
*/

 /*       //method 4 using java8
        List<Map.Entry<Integer ,Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list,(l1,l2)-> l1.getKey().compareTo(l2.getKey()));
        HashMap<Integer,Integer> map1 = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry : list){
            map1.put(entry.getKey(),entry.getValue());
            System.out.println("Key :- "+entry.getKey() + " "+ "Value :- "+entry.getValue());
        }*/

        // method 5 using java8

        HashMap<Integer, Integer> integerHashMap = map.entrySet().stream().
                sorted((l1, l2) -> l1.getKey().compareTo(l2.getKey())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        integerHashMap.forEach((k, v) -> System.out.println("Key :- " + k + " " + "Value :- " + v));
    }

    private static void sortByValue(HashMap<Integer, Integer> map) {

        // Method 1
        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());


    /*    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });

     HashMap<Integer, Integer> map1 = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            map1.put(entry.getKey(), entry.getValue());
            System.out.println("Key :- " + entry.getKey() + " " + "Value :- " + entry.getValue());
        }

        */

      // Method 2 using java8
 /*
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));


        HashMap<Integer, Integer> map1 = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            map1.put(entry.getKey(), entry.getValue());
            System.out.println("Key :- " + entry.getKey() + " " + "Value :- " + entry.getValue());
        }

        */

        // Method 3 using java8

        HashMap<Integer,Integer> hashMap = map.entrySet().stream().
                sorted(Comparator.comparing(Map.Entry::getValue)).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2) ->e1,LinkedHashMap::new));
        hashMap.forEach((k, v) -> System.out.println("Key :- " + k + " " + "Value :- " + v));
    }
}
