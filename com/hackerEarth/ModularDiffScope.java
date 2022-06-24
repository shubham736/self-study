package com.hackerEarth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;
    Difference(int[]  elements){
        this.elements = elements;
    }

    public void computeDifference() {
        List<Integer> integerList = new ArrayList<>();
         for (int i = 0 ; i < elements.length ; i++){
             for (int j = i+1; j < elements.length ; j++){
                 int diff=elements[i] - elements[j];
                 if(diff < 0){
                     diff = diff * (-1);
                 }
                 integerList.add(diff);
             }
         }
        Collections.sort(integerList);
         maximumDifference = integerList.get(integerList.size()-1);

    }
    // Add your code here

} // End of Difference class

public class ModularDiffScope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
