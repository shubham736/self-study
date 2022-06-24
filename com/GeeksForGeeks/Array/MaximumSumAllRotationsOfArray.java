package com.GeeksForGeeks.Array;

import java.util.*;
import java.util.stream.IntStream;

/*
    * Input: arr[] = {8, 3, 1, 2}
    Output: 29
    Explanation: Lets look at all the rotations,
    {8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
    {3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
    {1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
    {2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17

    Input: arr[] = {3, 2, 1}
    Output: 7
    Explanation: Lets look at all the rotations,
    {3, 2, 1} = 3*0 + 2*1 + 1*2 = 4
    {2, 1, 3} = 2*0 + 1*1 + 3*2 = 7
    {1, 3, 2} = 1*0 + 3*1 + 2*2 = 7
*
* */
public class MaximumSumAllRotationsOfArray {
    public static void main(String[] args) {
        Integer[] ints = {3, 2, 1};
        //IntStream ab = Arrays.stream(ints).filter(a->a%2==1).mapToInt(a ->a*a);
        //ab.forEach(System.out::println);
        System.out.println(getMaxRotateSum(ints));
        System.out.println(maxSum(ints , ints.length));
    }

    private static int getMaxRotateSum(Integer[] ints) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> list = Arrays.asList(ints);
        for (int i = 0; i < ints.length; i++) {
            Collections.rotate(list, ints.length-i);
            int sum =0;
            for (int j = 0; j < list.size(); j++) {
                sum+=list.get(j)*j;
            }
            integerList.add(sum);
        }
        OptionalInt optional = integerList.stream().mapToInt(e->e).max();
        if(optional.isPresent())
            return optional.getAsInt();
        return -1;
    }
    static int maxSum(Integer arr[], int n)
    {
        int sum = 0;
        int i;
        int pivot = findPivot(arr, n);

        // difference in pivot and index of
        // last element of array
        int diff = n - 1 - pivot;
        for(i = 0; i < n; i++)
        {
            sum= sum + ((i + diff) % n) * arr[i];
        }
        return sum;
    }

    // function to find pivot
    static int findPivot(Integer arr[], int n)
    {
        int i;
        for(i = 0; i < n; i++)
        {
            if(arr[i] > arr[(i + 1) % n])
                return i;
        }
        return 0;
    }
}
