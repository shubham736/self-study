package com.GeeksForGeeks.Array;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] ints = {4, 57, 1, 6, 56, 2, 7, 6};
        System.out.println("Initial Value : -");
        printArray(ints);
        System.out.println("Sorted Value : -");
        //printArray(bubbleSort(ints));
        printArray(insertionSort(ints));
        System.out.println(thirdLargestNumber(ints, 6));
    }

    static  void printArray(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }
    private static int thirdLargestNumber(int[] ints, int index) {
        int[] sortedValue = bubbleSort(ints);
        return sortedValue[sortedValue.length - index];
    }

    static int[] bubbleSort(int[] ints) {
        int size = ints.length;
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (ints[i] < ints[j]) {
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }

    static int[] insertionSort(int[] ints) {
        int size = ints.length;
        for (int i = 0; i < size; i++) {
            int key = ints[i];
            int j = i - 1;
            while (j >= 0 && ints[j] > key) {
                ints[j+1] = ints[j];
                j--;
            }
            ints[j+1] = key;
        }
        return  ints;
    }
}
