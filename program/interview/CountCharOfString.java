package program.interview;

import java.util.HashMap;
import java.util.Map;

public class CountCharOfString {
    public static void main(String[] args) {
        String str = "shubham gupta";
        HashMap<Character, Integer> map = printCharCount(str.toCharArray());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Key :- " + entry.getKey() + " count :- " + entry.getValue());
        }
    }

    static HashMap<Character, Integer> printCharCount(char[] chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }
}
