package self.Test;

import java.util.Arrays;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {
        //  sort();
        // System.out.println(rec(4));


        int n = 6;

        System.out.println("Count for " + n + " is " + count(n));


    }

    private static int rec(int i) {
        if (i == 0)
            return 0;
        else
            System.out.println(i);
        return rec(i - 1);
    }

    private static void sort() {
        TreeSet<Integer> TreeSet = new TreeSet<Integer>();
        Integer[] arr = {10, 23, 56, 59};
        for (int i = 0; i < arr.length; i++) {
            TreeSet.add(arr[i]);
        }

    }


// Java program to count number of
// possible ways to a given score
// can be reached in a game where
// a move can earn 3 or 5 or 10


    // Returns number of ways to reach score n
    static int count(int n) {
        // table[i] will store count of solutions for
        // value i.
        int table[] = new int[n + 1], i;

        // Initialize all table values as 0
        Arrays.fill(table, 0);

        // Base case (If given value is 0)
        table[0] = 1;
        table[n] = 1;

        // One by one consider given 3
        // moves and update the table[]
        // values after the index greater
        // than or equal to the value of
        // the picked move
        for (i = 2; i <= n; i++)
            table[i] += table[i - 2];
        for(int s: table){
            System.out.print(s+"s11s");
        }
        System.out.println();
        for (i = 4; i <= n; i++)
            table[i] += table[i - 4];
        for(int s: table){
            System.out.print(s+"s44s");
        }
        System.out.println();

        for (i = 6; i <= n; i++)
            table[i] += table[i - 6];
        for(int s: table){
            System.out.print(s+"s66s");
        }

        return table[n];
    }

}

