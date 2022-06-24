package com.GeeksForGeeks.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArraySmallPrimes {
    public static void main(String[] args) {
        Integer[] ints = {3, 5, 7, 3, 3, 13, 5, 13, 29, 13};
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(ints));
        Object[] objects = set.toArray();
        printArray(objects);
    }

    static void printArray(Object[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }
}
