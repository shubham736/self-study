package com.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Triplets {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\abc.txt"));
        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[arrCount];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        System.out.println(countTriplet(arr , arrCount));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }

    static  int countTriplet(int arr[], int n) {
        // code here
        int totalTriplets = 0;
        for (int outerIndex = 0; outerIndex < n; outerIndex++) {
            int firstElement = arr[outerIndex];

            for (int innerIndex = outerIndex+1; innerIndex < n; innerIndex++) {
                int sum = firstElement + arr[innerIndex];
                for (int element : arr){
                    if (element == sum)
                        totalTriplets++;
                }
            }
        }

        return totalTriplets;
    }
}

