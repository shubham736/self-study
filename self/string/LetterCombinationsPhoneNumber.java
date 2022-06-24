package self.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("584"));
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> res = new ArrayList<>();
        backtrack(digits, res, 0, "", map);
        return res;
    }

    private static void backtrack(String digits, List<String> res, int i, String curStr, HashMap<Character, String> map) {
        if (curStr.length() == digits.length()) {
            res.add(curStr);
            return;
        }
        for (char c: map.get(digits.charAt(i)).toCharArray()) {
            backtrack(digits, res, i + 1, curStr + c, map);
        }
        StringBuilder s1 = new StringBuilder("");
        s1.reverse();
    }
}
