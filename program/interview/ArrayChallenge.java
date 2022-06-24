package program.interview;

import java.util.Scanner;
/*      Have the function ArrayChallenge(arr) take the array of numbers stored in arr and return 1
        if the mode equals the mean, 0 if they don't equal each other (ie. [5, 3, 3, 3, 1] should
        return 1 because the mode (3) equals the mean (3)).
        The array will not be empty, will only contain positive
        integers, and will not contain more than one mode.
        Input: new int[] {1, 2, 3}
        Output: 0
        Input: new int[] {4, 4, 4, 6, 2}
        Output: 1
        Browse Resources*/

class ArrayChallenge {

    public static int ArrayChallenge(int[] arr) {
        int size = arr.length;
        if (mode(arr, size) == mean(arr, size)) {
            return 1;
        }
        return 0;
    }

    public static int mode(int a[], int n) {
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < n; ++i) {
            int count = 0;
            for (j = 0; j < n; ++j) {
                if (a[j] == a[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }

    public static int mean(int arr[], int size) {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total = total + arr[i];
        }
        int average = total / size;
        return average;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
       // System.out.print(ArrayChallenge(s.nextInt()));
    }

}