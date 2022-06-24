package com.GeeksForGeeks.Array;

import com.utlity.Print;

public class N_numbersDivisibleByM_number {
    public static void main(String[] args) {
        int range = Print.sc.nextInt();
        for (int i = 1; i <= range; i++) {
            //if (i % 3 == 0 || i % 5 == 0 || i % 2 == 0)  use either divisible by 2,3,5
            if (i % 3 == 0 && i % 5 == 0 && i % 2 == 0)   // use most divisible by 2,3,5
                System.out.println(i + " ");
        }
    }
}
