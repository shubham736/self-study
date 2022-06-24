package com.GeeksForGeeks.Array;

import java.util.Arrays;

/*
 * For example, for N = 4 and S = {1,2,3},
 * there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4.
 *  For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6},
 * {2,3,5} and {5,5}. So the output should be 5.
 *
 * */
public class CoinProblem {
    public static void main(String[] args) {
        int[] arrayOfCoin = {2, 5, 3, 6};
        int size = arrayOfCoin.length;
        int value = 10;
        System.out.println(getTotalCount(arrayOfCoin, size, value));
    }

    private static Long getTotalCount(int[] arrayOfCoin, int size, int value) {
        long[] tableValue = new long[value + 1];
        Arrays.fill(tableValue, 0);
        tableValue[0] = 1;

        for (int outerLoop = 0; outerLoop < size; outerLoop++) {
            for (int innerLoop = arrayOfCoin[outerLoop]; innerLoop <= value; innerLoop++) {
                tableValue[innerLoop] += tableValue[innerLoop - arrayOfCoin[outerLoop]];
            }
        }
        return tableValue[value];

    }
}
