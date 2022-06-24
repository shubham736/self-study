package self.programs;

import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       checkBalancedBracket();
      //  checkRotationOfTwoString();
       // convertRomanToInteger();
       // integerToRoman(3999);
    }

    public static void integerToRoman(int num) {

        System.out.println("Integer: " + num);
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        System.out.println("Roman: " + roman.toString());
        System.out.println("---------------------------------------------------");
    }

    private static void convertRomanToInteger() {
        String roman = "MMMCMXCIx";
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        roman = roman.toUpperCase();
        int result =0;
        for(int i =0 ; i < roman.length() ;i++){
            if(i >0 && map.get(roman.charAt(i)) > map.get(roman.charAt(i-1))){
                result += map.get(roman.charAt(i)) - (2* map.get(roman.charAt(i-1)));
            }else
                result += map.get(roman.charAt(i));
        }
        System.out.println("Integer value of "+roman+ " is :- "+result);

    }

    private static void checkRotationOfTwoString() {
        String str1 = "abc";
        String str2 = "cab";
        if(str1.length() == str2.length() && (str1+str1).contains(str2))
            System.out.println("Rotated String");
        else
            System.out.println("Not Rotated");
    }

    private static void checkBalancedBracket() {
        String str = "(]";
        if(validateParenthess(str))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    private static boolean validateParenthess(String str) {
        Stack<Character> stack = new Stack<>();
        boolean res =true;
        for(int i = 0 ; i < str.length(); i ++){
            char c = str.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            if (stack.isEmpty())
                res= false;
            char check;
            switch (c){
                case ')':
                check = stack.pop();
                if(check == '{' || check =='[')
                    res= false;
                break;
                case ']':
                    check = stack.pop();
                    if(check == '{' || check =='(') {
                        res = false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check =='[')
                        res= false;
                    break;
            }
        }
        if(res)
            return stack.isEmpty();
        return res;
    }
}

