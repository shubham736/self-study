package com.GeeksForGeeks.Array;

public class MaxSumPathInTwoArrays {
    public static void main(String[] args) {
/*        Scanner s = new Scanner(System.in);
        int sizeA = s.nextInt();
        Integer[] intA = new Integer[sizeA];
        for (int i = 0; i < sizeA; i++) {
            intA[i] = s.nextInt();
        }
        int sizeB = s.nextInt();
        Integer[] intB = new Integer[sizeB];
        for (int i = 0; i < sizeB; i++) {
            intB[i] = s.nextInt();
        }*/
        int ar1[] = {2, 3, 7, 10, 12};
        int ar2[] = {1, 5, 7, 8};
        int m = ar1.length;
        int n = ar2.length;
        // Function call
        System.out.println("Maximum sum path is :" + maxPathSum(ar1, ar2, m, n));
    }

    static void printArray(Integer[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }

    // Utility function to find maximum of two integers
    static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    // This function returns the sum of elements on maximum
    // path from beginning to end
    static int maxPathSum(int ar1[], int ar2[], int m, int n) {
        // initialize indexes for ar1[] and ar2[]
        int i = 0, j = 0;
        // Initialize result and current sum through ar1[]
        // and ar2[].
        int result = 0, sum1 = 0, sum2 = 0;
        // Below 3 loops are similar to merge in merge sort
        while (i < m && j < n) {
            // Add elements of ar1[] to sum1
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];
                // Add elements of ar2[] to sum2
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];
                // we reached a common point
            else {
                // Take the maximum of two sums and add to
                // result
                result += max(sum1, sum2);
                // Update sum1 and sum2 for elements after
                // this intersection point
                sum1 = 0;
                sum2 = 0;
                // Keep updating result while there are more
                // common elements
                int temp = i;
                while (i < m && ar1[i] == ar2[j])
                    sum1 += ar1[i++];
                while (j < n && ar1[temp] == ar2[j])
                    sum2 += ar2[j++];
                result += max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
            }
        }
        // Add remaining elements of ar1[]
        while (i < m)
            sum1 += ar1[i++];
        // Add remaining elements of ar2[]
        while (j < n)
            sum2 += ar2[j++];
        // Add maximum of two sums of remaining elements
        result += max(sum1, sum2);
        return result;
    }
}
