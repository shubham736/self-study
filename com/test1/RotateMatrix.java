package com.test1;
// Java program to rotate a matrix
import java.lang.*;
import java.util.*;

public class RotateMatrix {
  // size of matrix
    static final int M=3;
    static final int N=3;
    // Function to rotate matrix by k times
    static void rotateMatrix(int matrix[][], int k)
    {
// Temporary array of size M
        int temp[]=new int[M];

        k = k % M;
        for (int i = 0; i < N; i++)
        {
// copy first M-k elements to temporary array
            for (int t = 0; t < M - k; t++)
                temp[t] = matrix[i][t];

// copy the elements from k to end to starting
            for (int j = M - k; j < M; j++)
                matrix[i][j - M + k] = matrix[i][j];

// copy elements from temporary array to end
            for (int j = k; j < M; j++)
                matrix[i][j] = temp[j - k];
        }
    }

    // Function to display the matrix
    static void printMatrix(int matrix[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    // Driver code
    public static void main (String[] args)
    {
        int matrix[][] = {{1,2,3} ,{4,5,6} ,{7,8,9}};
        System.out.println("The inputted matrix : ");
        printMatrix(matrix);
        int k = 1;

// Rotate matrix k times
        rotateMatrix(matrix, k);

// Print rotated matrix
        System.out.println("\nThe Rotated Matrix : \n");
        printMatrix(matrix);
    }
}

// This code is contributed by Sahil_Bansall
