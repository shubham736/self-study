package program.interview;

import java.util.Scanner;

public class Anagram {
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();
        if(isAnagram(s,s1)){
            System.out.println("ANAGRAM");
        }else{
            System.out.println("NOT ANAGRAM");
        }

    }
    public  static  boolean isAnagram(String s , String s1){
        if (s== null && s1==null)
            return  true;
        if ((s!= null && s1==null)|| (s==null && s1!=null) ||(s.length() != s1.length()))
            return false;
        else{
            char[] chars = s.toLowerCase().toCharArray();
            char[] chars1 = s1.toLowerCase().toCharArray();
            int[]  ints = new int[26];
            for (char c : chars){
                ints[c-97]++;
            }
            for(char c: chars1){
                ints[c-97]--;
            }
            for(int i : ints){
                if(i!=0){
                    return false;
                }
            }
        }
        return  true;
    }

}
