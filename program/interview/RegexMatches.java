package program.interview;

public class RegexMatches {
    public static void main(String[] args) {
        String reg = ".@.";
        String str = "a@N";
        String str2 = "Java@.com";
        String str1 = "HackerRack@.com";
        matchStrings(reg, str1);
        matchStrings(reg, str);
        matchStrings(reg, str2);
    }
    private static void matchStrings(String reg, String str) {
        if (str.matches(reg)) {
            System.out.println(str + " matches");
        } else {
            System.out.println(str + " does matches");
        }
    }
}
