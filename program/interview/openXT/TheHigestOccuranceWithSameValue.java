package program.interview.openXT;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TheHigestOccuranceWithSameValue {
    public static void main(String[] args) {
        int[] ints = {1,2,2,3,3,8,3};
       // int[] ints = {1,1,2,3,3,3,8,3};  //No data found  Ex
        higestOccurance(ints);
    }

    private static int higestOccurance(int[] ints) {
        HashMap<Integer ,Integer>  map = new HashMap<>();
        for(int i : ints){
            if(map.get(i) == null){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        HashMap<Integer,Integer> hashMap = map.entrySet().stream()
                .sorted((l1,l2)->l2.getKey().compareTo(l1.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1,e2) -> e1, LinkedHashMap::new));

        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            if(entry.getKey() == entry.getValue()) {
                System.out.println("Result value is : " + entry.getKey() + "  with total count " + entry.getValue());
                return entry.getKey();
            }
        }
        System.out.println("No data found ");
        return 0;
    }
}
