package com.GeeksForGeeks.Array;

import com.utlity.Print;

public class SubArrayIsMountain {
    public static void main(String[] args) {
        int [] input = {2, 3, 2, 4, 4, 6, 3, 2};
        int size = input.length;
        int leftRange = 0;
        int rightRange= 2;
        int[] left = new int[size];
        int[] right = new int[size];
        preprocesses(input , left , right ,size);

        if(isSubArrayMountain(left,right,leftRange,rightRange))
            System.out.println("Is Mountain");
        else
            System.out.println("Not mountain");
    }

    private static boolean isSubArrayMountain(int[] left, int[] right, int leftRange, int rightRange) {
        System.out.println( leftRange +" "+ rightRange);
        return  (right[leftRange]  >=  left[rightRange]);
    }

    private static void preprocesses(int[] input, int[] left, int[] right, int size) {
        left[0] = 0;
        int lastIncr = 0;
        Print.printArray(input);
        for(int i =1; i < size ; i++){
            if (input[i] > input[i-1])
                lastIncr = i;
            left[i] = lastIncr;
        }
        Print.printArray(left);
        right[size-1] =  size-1;
        int firstDec = size -1;

        for(int i =size-2 ; i >= 0 ; i--){
            if(input[i] > input[i+1])
                firstDec = i;
            right[i] = firstDec;
        }
        Print.printArray(right);
    }
}
