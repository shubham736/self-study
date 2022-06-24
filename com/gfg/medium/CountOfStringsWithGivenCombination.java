package com.gfg.medium;


    /*
    * Given a length n, count the number of strings of length n that
    * can be made using ‘a’, ‘b’ and ‘c’ with at-most one ‘b’
    * and two ‘c’s allowed.
    *
    *   Input : n = 3
        Output : 19
        Below strings follow given constraints:
        aaa aab aac aba abc aca acb acc baa
        bac bca bcc caa cab cac cba cbc cca ccb

        Input  : n = 4
        Output : 39
    * */
public class CountOfStringsWithGivenCombination {
    public static void main(String[] args) {
        System.out.println(countStr(4));
    }
    static int countStr(int n)
    {
        return 1 + (n * 2) +
                (n * ((n * n) - 1) / 2);
    }
}
