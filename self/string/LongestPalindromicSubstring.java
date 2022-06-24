package self.string;

import java.util.TreeMap;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    public static String  longestPalindrome(String s) {
        // System.out.println(isPalindrome(s));
        int largestLenght = Integer.MIN_VALUE,resLargestLenght = Integer.MIN_VALUE;
        String value=null;
        int size =s.length();

        for(int i = 0; i<size;i++){
            String temp =s.substring(i,size);
            String resTemp =s.substring(0,size-i);
            if(isPalindrome(temp) && (temp.length() > largestLenght)){
                    largestLenght= temp.length();
                    value =temp;
            }
            if(isPalindrome(resTemp) && (resTemp.length() > resLargestLenght)){
                resLargestLenght= resTemp.length();
            }
            if(largestLenght <resLargestLenght){
                value = resTemp;
            }
        }

        return value;


    }

    private static boolean isPalindrome(String input){
        StringBuilder str  = new StringBuilder(input);
        return str.reverse().toString().equals(input);

    }
}
