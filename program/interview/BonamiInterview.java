package program.interview;

import java.util.HashMap;
import java.util.Map;

public class BonamiInterview {
    public static void main(String[] args) {
        String str= "This is my book";
        char[] input = str.toCharArray();
        int size= stringSize(input);
        System.out.println("String length :- "+ size);
        HashMap<Character , Integer>  map = stringCharAndLength(input);
        for(Map.Entry<Character,Integer>  entry : map.entrySet()){
            System.out.println("Key : "+entry.getKey() + " and  Value : "+entry.getValue());
        }

        int[]  input1 = {12, 34,5,45,17};
        for(int i : nextLargest(input1)){
            System.out.print( i +" ");
        }
    }
    static  int[] nextLargest(int[] ints){
        int size = ints.length;
        int[] result = new int[size];
        int index =0;
        for(int i = 0 ; i < size-1 ;i++ ){
            for (int j = 1+i ; j< size -1 ; j++){
                if(ints[i] < ints[j]){
                    result[index] = ints[j];
                    index++;
                    break;
                }
            }
        }
        if (index < size){
            for(int i = index ; i< size ; i++){
                result[i] = -1;
            }
        }
        return  result;
    }
    static  int stringSize(char[] chars){
        int counter = 0;
        for(char c : chars){
            counter++;
        }
        return counter;
    }

    static  HashMap<Character , Integer> stringCharAndLength(char[] chars){
        HashMap<Character , Integer>  map = new HashMap<>();
        for(char c: chars){
            if(map.get(c) == null){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        return map;
    }
}
