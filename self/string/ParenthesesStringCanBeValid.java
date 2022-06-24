package self.string;
// https://leetcode.com/problems/valid-parentheses/submissions/
// https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/
public class ParenthesesStringCanBeValid {
    public static void main(String[] args) {
        String s = "))()))", locked = "010100";
        System.out.println(canBeValid(s,locked));
    }
    public static boolean canBeValid(String s, String locked) {
        int N = s.length();
        if (N % 2 == 1) {
            return false;
        }

        int balanceLeftToRight = 0, unlockedLeftToRight = 0;
        int balanceRightToLeft = 0, unlockedRightToLeft = 0;
        //checking left to right, "(" +1, ")" -1
        for (int i = 0; i < N && balanceLeftToRight + unlockedLeftToRight >= 0
                && balanceRightToLeft + unlockedRightToLeft >= 0; i++) {
            if (locked.charAt(i) == '0') {
                unlockedLeftToRight++;
            } else {
                if (s.charAt(i) == '(') {
                    balanceLeftToRight++;
                } else {
                    balanceLeftToRight--;
                }
            }
            int rightToLeftIdx = N - i - 1;
            if (locked.charAt(rightToLeftIdx) == '0') {
                unlockedRightToLeft++;
            } else {
                if (s.charAt(rightToLeftIdx) == ')') {
                    balanceRightToLeft++;
                } else {
                    balanceRightToLeft--;
                }
            }
        }
        if (Math.abs(balanceLeftToRight) > unlockedLeftToRight || Math.abs(balanceRightToLeft) > unlockedRightToLeft) {
            return false;
        }
        return true;
    }
}
