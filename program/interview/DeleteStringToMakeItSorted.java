package program.interview;

import java.util.Scanner;

public class DeleteStringToMakeItSorted {
    static String result = "";
    static boolean check = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = charToRemove(s);
        System.out.println(result);
        System.out.println(noOfCharToRemove(s, result));

    }

    private static int noOfCharToRemove(String original, String result) {
        return original.length() - result.length();
    }

    static String charToRemove(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        String s1 ;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i + 1] < chars[i]) {
                s1 = charRemoveAt(s, i);
                check = arraySortedOrNot(s1.toCharArray(), s1.length());
                if (!check) {
                    charToRemove(s1);
                } else { result = s1; }
            }
            if (check)
                break;
        }
        return result;

    }

    static boolean arraySortedOrNot(char arr[], int n) {
        // Array has one or no element or the
        // rest are already checked and approved.
        if (n == 1 || n == 0)
            return true;

        // Unsorted pair found (Equal values allowed)
        if (arr[n - 1] < arr[n - 2])
            return false;

        // Last pair was sorted
        // Keep on checking
        return arraySortedOrNot(arr, n - 1);
    }

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
}
