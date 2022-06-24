package com.gfg.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckThreeOrMoreConsecutiveIdenticalCharOrNumbers {
    public static void main(String[] args) {
        System.out.println(isIdentical("111"));
    }

    public static boolean isIdentical(String str) {
        // Regex to check three or
        // more consecutive identical
        // characters or numbers
        String regex
                = "\\b([a-zA-Z0-9])\\1\\1+\\b";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // return false
        if (str == null) {
            return false;
        }

        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(str);

        // Return if the string
        // matched the ReGex
        return m.matches();
    }
}
