package com.hackerEarth;

import java.util.Scanner;

public class PalindromeIndex {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String str = s.nextLine();
        //checkPalindrome(new StringBuilder(str));
        System.out.println(palindromeIndex(str));
    }
    public static int palindromeIndexCorrect(String s) {
        int l = s.length();
        int i,j,a,b;
        for (i=0, j=l-1; i<l; i++,j--){
            if (s.charAt(i)!=s.charAt(j))
                break;
        }
        if (i>j) return -1;

        for (a = i+1, b = j;a<j && b>i+1; a++,b--){
            if (s.charAt(a)!=s.charAt(b))
                return j;
        }
        return i;
    }



    static int palindromeIndex(String str) {

        int size = str.length();
        for (int i = 0; i < size; i++) {
            StringBuilder temp = new StringBuilder(str);
            temp.deleteCharAt(i);
            if (checkPalindrme(temp)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean checkPalindrme(StringBuilder temp) {
        int size = temp.length();
        for (int i = 0; i < size / 2; i++) {
            if (temp.charAt(i) == temp.charAt(size - i - 1)) {
                continue;
            } else
                return false;
        }
        return true;
    }
    private static boolean checkPalindrome(StringBuilder temp) {
        StringBuilder builder = new StringBuilder();
        for(int i = temp.length()-1 ; i >= 0 ;i--){
            builder.append(temp.charAt(i));
        }
       // if(temp.equals(builder))
         if(temp.toString().equals(builder.toString()))
            return true;
        return false;
    }

}
