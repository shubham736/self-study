package com.utlity;

import java.util.Scanner;

public class Print {

    public static Scanner sc = new Scanner(System.in);

    public static void printArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }

    public static void printArray2D(int[][] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++)
                System.out.print(ints[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static int[] InputInteger() {
        int size = sc.nextInt();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = sc.nextInt();
        }
        return ints;
    }

    public static int[][] InputInteger2D() {
        int m, n, i, j;
        System.out.print("Enter the number of rows: ");
        //taking row as input
        m = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        //taking column as input
        n = sc.nextInt();
        // Declaring the two-dimensional matrix
        int array[][] = new int[m][n];
        // Read the matrix values
        System.out.println("Enter the elements of the array: ");
        //loop for row
        for (i = 0; i < m; i++)
            //inner for loop for column
            for (j = 0; j < n; j++)
                array[i][j] = sc.nextInt();

        return array;
    }
}
