package self.string;

import java.util.Arrays;

public class LengthOfLongestSubstring {

    /*Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.*/
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int[] map = new int[128];
        Arrays.fill(map, -1);
        int maxLength = 1;
        int i, j;
        for (i = 0, j = 0; j < s.length(); j++) {

            if (map[s.charAt(j)] >= 0) {
                maxLength = Math.max(maxLength, j - i);
                i = Math.max(i, map[s.charAt(j)] + 1);
            }
            map[s.charAt(j)] = j;
        }
        return Math.max(maxLength, j - i);
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }
}
