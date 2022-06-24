package com.GeeksForGeeks.Array;

public class DuplicateValueInArray {
    public static void main(String[] args) {
        //int[] ints = {1,4,6,7,6,1};
        int[] ints = {20,60,70,60,34,3,3};
      // int[] ints = { 1, 2, 3, 1, 3, 6, 6 ,6};
       // method1(ints);
        printArray(ints);
        method2(ints);
    }

    // dont work is more den 2 time any no is repeated as well can occur array index of bound
    // O(n) time and O(1)
    static  void method1(int[]  ints ){
        for(int i = 0;i<ints.length ; i++){
            int j = Math.abs(ints[i]);
            if(ints[j] >= 0)
                ints[j] = -ints[j];
            else
                System.out.println(j + " ");
        }
    }
    static  void printArray(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }
    static  void method2(int[] ints){
        int size= ints.length;
        for (int i : ints){
            ints[i% size] = ints[i%size]+size;
        }
        printArray(ints);
        System.out.println("The repeating elements are : ");
        for (int i=0 ; i < ints.length ; i++){
            if(ints[i] >= size*2)
                System.out.println(i + " ");
        }
    }
}
