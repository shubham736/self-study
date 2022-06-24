package codeChef.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        char[] charArr = str.toCharArray();
        int result = 0;
        for (char c : charArr) {
            if (Character.isDigit(c))
                result += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(result);
    }
}
