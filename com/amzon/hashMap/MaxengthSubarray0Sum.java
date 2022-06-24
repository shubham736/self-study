package com.amzon.hashMap;

import java.util.HashMap;

public class MaxengthSubarray0Sum {

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println("Length of the longest 0 sum subarray is "
                + maxSubArrayLength(arr));
    }

    private static int maxSubArrayLength(int[] ints) {

        int max_length = 0 ;
        int sum = 0;
        HashMap<Integer ,Integer>  map = new HashMap<>();
        for (int i =0 ; i < ints.length ; i++){
            sum +=ints[i];

            if(ints[i] == 0 && max_length == 0){
                max_length =1;
            }

            if(sum == 0){
                max_length +=1;
            }

            Integer perv_i = map.get(sum);
            if(perv_i != null){
                max_length = Math.max(max_length , i-perv_i);
            }else
                map.put(sum,i);
        }
        return  max_length;
    }
}
