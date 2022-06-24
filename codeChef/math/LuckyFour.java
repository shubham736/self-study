package codeChef.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        method1();

    }

    private static void method1() {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for (int i = 1; i <= t; i++) {
            int num = kb.nextInt();
            int countFour = 0;
            while (num > 0) {
                if (num % 10 == 4) {
                    countFour++;
                }
                num = num / 10;
            }
            System.out.println(countFour);
        }
    }

    private static void method2() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int c = Integer.parseInt(reader.readLine());
            while (c-- > 0) {
                String number = reader.readLine();
                int[] arr = new int[9];
                for (int i = 0; i < number.length(); i++) {
                    int index = Integer.parseInt(String.valueOf(number.charAt(i)));
                    arr[index] += 1;
                }
                System.out.println(arr[4]);
            }

        } catch (Exception e) {
            return;
        }
    }

    public int pivotIndex(int[] nums) {
        int total = 0, sum = 0;

        for (int n : nums) {
            total += n;
        }

        for (int i = 0; i < nums.length; i++) {
            if (sum * 2 == total - nums[i]) {

                return i;
            }
            sum += nums[i];
        }

        return -1;
    }



}
