package com.GeeksForGeeks.Array;

public class MaxAndSecondMax {
    public static void main(String[] args) {
        int[] ints = {4, 57, 1, 6, 56, 2, 7, 6};
        System.out.println("Initial Value : -");
        printArray(ints);
        System.out.println("Sorted Value : -");
        printArray(bubbleSort(ints));
        System.out.println(maxAndSecondMax(ints));
    }
    static  void printArray(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }
    private static StringBuffer maxAndSecondMax(int[] ints) {
        int[] sortedValue = bubbleSort(ints);
        StringBuffer buffer = new StringBuffer();
        buffer.append(sortedValue[sortedValue.length -1] + " "
                +sortedValue[sortedValue.length - 2]);
        return buffer;
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
}
