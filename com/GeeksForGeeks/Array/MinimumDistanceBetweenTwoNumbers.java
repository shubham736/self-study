package com.GeeksForGeeks.Array;

/*
* Input:
    N = 4
    A[] = {1,2,3,2}
    x = 1, y = 2
    Output: 1
    Explanation: x = 1 and y = 2. There are
    two distances between x and y, which are
    1 and 3 out of which the least is 1.

    Example 2:
    Input:
    N = 7
    A[] = {86,39,90,67,84,66,62}
    x = 42, y = 12
    Output: -1
*
* */

public class MinimumDistanceBetweenTwoNumbers {
    public static void main(String[] args) {
        int[] ints = {86, 39, 90, 67, 84, 66, 62};
        int x = 42, y = 12;
        System.out.println(minDistBetTwoPoints(ints, x, y));
    }

    private static int minDistBetTwoPoints(int[] ints, int i, int i1) {
        int steps = 0;
        boolean flag = false;
        for (int i2 : ints) {
            if (i2 == i) {
                flag = true;
            }
            if (i2 == i1)
                flag = false;
            if (flag)
                steps++;
        }
        if (flag || steps == 0)
            return -1;
        return steps;
    }

}

