package com.amzon.test;


/*
 *  perferct seq ,iff all Head comes first the all Tails appear
 * */
public class CountOfFlipCoin {
    public static void main(String[] args) {
        System.out.println(countCoinFlips("THHHTH"));
    }

    public static int countCoinFlips(String s) {

        int flipCount = 0;

        int countHeads = 0;

        int countTails = 0;

        char comp = 'H';

        for (char ch : s.toCharArray()) {

            countHeads += ch == 'H' ? 1 : 0;

            countTails += ch == 'T' ? 1 : 0;

            comp = countHeads > countTails ? 'H' : 'T';
        }

        int curr = 0;

        for (char ch : s.toCharArray()) {

            if (ch == comp) {

                if (curr != 0) flipCount++;
            } else {
                curr++;
            }

            flipCount = Math.min(flipCount, curr);
        }

        return flipCount;

    }
}
