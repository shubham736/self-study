package program.string;

import java.util.Scanner;

public class CheckStringIsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT Palindrome");
        }

    }
    static boolean isPalindrome(String s) {
        if (s.trim() == "" || s == null)
            return false;
        else {
            int size = s.length();
            for (int i = 0; i <= size / 2; i++) {
                if (s.charAt(i) != s.charAt(size - 1 - i)) {
                    return false;
                }
            }

        }
        return true;
    }
}
