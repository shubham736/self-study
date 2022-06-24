package program.string;

import java.util.Scanner;

public class TwoStringsAreRotationOfEachOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();

        if (areRotations(s, s1)) {
            System.out.println("Rotated");
        } else {
            System.out.println("NOT Rotated");
        }
    }

    static boolean areRotations(String str1, String str2) {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        return (str1.length() == str2.length()) &&
                ((str1 + str1).contains(str2));
    }

    public static boolean isRotation(String a, String b) {
        int n = a.length();
        int m = b.length();
        if (n != m)
            return false;

        // create lps[] that will hold the longest
        // prefix suffix values for pattern
        int lps[] = new int[n];

        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to n-1
        while (i < n) {
            if (a.charAt(i) == b.charAt(len)) {
                lps[i] = ++len;
                ++i;
            } else {
                if (len == 0) {
                    lps[i] = 0;
                    ++i;
                } else {
                    len = lps[len - 1];
                }
            }
        }

        i = 0;

        // match from that rotating point
        for (int k = lps[n - 1]; k < m; ++k) {
            if (b.charAt(k) != a.charAt(i++))
                return false;
        }
        return true;
    }

}
