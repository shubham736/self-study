package com.hackerEarth;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class HighestValuePalindrome {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String s = scanner.nextLine();
        String result = highestValuePalindrome(s,  k);
        System.out.println(result +" Method ");
        getValueMethod2(s,n,k);
        scanner.close();
    }



    private static String highestValuePalindrome(String s,  int k) {
        char[] chars = s.toCharArray();
        int minChange = 0;
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                minChange++;
            }
        }
        if (minChange > k) {
            return "-1";
        }
        int changeBoth = k - minChange;
        int i = 0;
        int j = chars.length - 1;
        for (; i <= j; i++, j--) {
            if (chars[i] != chars[j]) {
                char maxChar = (char) Math.max(chars[i], chars[j]);
                if (maxChar != '9' && changeBoth - 1 >= 0) {
                    chars[i] = '9';
                    chars[j] = '9';
                    changeBoth--;
                } else {
                    chars[i] = maxChar;
                    chars[j] = maxChar;
                    minChange--;
                }
            } else {
                char maxChar = (char) Math.max(chars[i], chars[j]);
                if (maxChar != '9' && changeBoth - 2 >= 0) {
                    chars[i] = '9';
                    chars[j] = '9';
                    changeBoth -= 2;
                }
            }
        }
        if (changeBoth != 0 && i - 1 == j + 1) {
            chars[i - 1] = '9';
        }
        String palindrome = new String(chars);
        return palindrome;
    }

    public static  String getValueMethod2(String s ,int n , int k){
        char[] c = s.toCharArray();
        boolean[] ch = new boolean[n];
        for (int i = 0; i < n/2; ++i) {
            if (c[i] != c[n - i - 1]) {
                c[i] = c[n - i - 1] = (char)Math.max(c[i], c[n - i - 1]);
                ch[i] = true;
                --k;
            }
        }
        if (k < 0) {
            System.out.println(-1);
            return "";
        }
        for (int i = 0; i < n/2; ++i) {
            if (c[i] != '9') {
                if (ch[i] && k > 0) {
                    c[i] = c[n - i - 1] = '9';
                    --k;
                }
                if (!ch[i] && k > 1) {
                    c[i] = c[n - i - 1] = '9';
                    k -= 2;
                }
            }
        }
        if (n % 2 == 1 && k > 0) {
            c[n/2] = '9';
        }
        System.out.println(new String(c));
        return "";
    }
}
