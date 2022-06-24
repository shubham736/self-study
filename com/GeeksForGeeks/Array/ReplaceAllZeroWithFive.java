package com.GeeksForGeeks.Array;

import java.util.Scanner;

public class ReplaceAllZeroWithFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println("Input Value :- "+i);
        System.out.println("Result value :- " + convertFive(i));
    }

    private static int convertFive(int i) {
        String s = String.valueOf(i);
        char[] chars = s.toCharArray();
        s= s.replace("0" ,"5");
        for (int j = 0 ; j < chars.length ;j++){
            if(chars[j] =='0'){
                chars[j] ='5';
            }
        }
        return  Integer.parseInt(new String(chars));
    }

    private static int convertFivMethod1(int i) {
        String s = String.valueOf(i);
        char[] chars = s.toCharArray();
        s= s.replace("0" ,"5");
        return Integer.parseInt(s);
    }
}
