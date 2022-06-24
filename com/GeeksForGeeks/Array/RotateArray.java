package com.GeeksForGeeks.Array;

import com.utlity.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class RotateArray {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5,6,7,8,9};

        Arrays.stream(ints).filter(RotateArray::isPrime).forEach(System.out::print);

       // List<Integer> list =  new ArrayList(Arrays.asList(ints));
        int rotateBy = 2;
/*        list.stream().forEach(System.out::print);
        System.out.println();
        Collections.rotate(list ,2);
        list.stream().forEach(System.out::print);*/
        System.out.println();
        Print.printArray(rotateBy(ints, rotateBy));
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }
    private static int[] rotateBy(Integer[] ints, int rotateBy) {
        int size = ints.length;
        int[] result = new int[size];
        for(int i = rotateBy ; i < size ;i++){
            result[i-rotateBy] = ints[i];
        }
        for(int i =0; i < rotateBy ; i++ ){
            result[size-rotateBy+i] = ints[i];
        }
        return  result;
    }
}
