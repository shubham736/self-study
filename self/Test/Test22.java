package self.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.Scanner;


public class Test22 {



    static int f(int n){
        return (n < 3) ? n-1 : f(n-1)+f(n-2);
    }
   static int fun(int a,int b){
        if(b ==0)
            return a;
        else
            return fun(b,a%b);
    }
    static int fib(int n){
        if(n <= 1)
            return n;
        return fib(n-1) +fib(n-2);
    }

    static int seq(int n){
        if(n == 0||n == 1 || n == 2)
            return 0;
        if(n ==3)
            return 1;
        return seq(n-1) +seq(n-2) +seq(n-3);
    }

    public static void main(String[] args) {

        System.out.println(f(5)+"khkjh");
        System.out.println(fun(100,2000) +"There ");
        System.out.println(fib(6) +"Where ");

        for(int i = 1; i < 6; i++){
            System.out.print(seq(i)+ " ");
        }
        System.out.println();
  /*    ArrayList<String> strings = new ArrayList<>();
        strings.add("aAaA");
        strings.add("AaA");
        strings.add("aAa");
        strings.add("AAaa");
        Collections.sort(strings);
        for(String s: strings){
            System.out.print(s+" ");
        }
   */
        int i=0,sum=0;
        while(i<100){
            sum = i+sum;
            sum = i+sum;
            i =i+1;
        }
        System.out.println(sum+"Here");

        Optional optional = Optional.of("Game of Throne");
        String[] strings =  new String[10];
        Optional optional1 = Optional.ofNullable(strings[9]);
        System.out.println(optional1.isPresent());
        System.out.println(optional.isPresent());

     /*   String stringValue= "abcdabcde";
        String subString = "aaa";
        System.out.println(Integer.valueOf(5).MIN_VALUE);
        //System.out.println(checkSubString(stringValue , subString));
        String str = "ABC".concat("sqp").join(":").concat("xyz").toUpperCase();
        System.out.println(str);
        char ch1 = 'A';
        char ch2 = 'Z';
        //variable that stores the integer value of the character
        int asciivalue1 = ch1;
        int asciivalue2 = ch2;
        System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);*/

/*        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        int k = scanner.nextInt();

        StringBuilder builder = new StringBuilder(input.length());
        for (int i = 0; i < n; i++) {
            char temp = input.charAt(i);
            boolean upperCase = Character.isUpperCase(temp);
            if (Character.isLetter(temp)) {
                temp += k%26;
                if (!Character.isLetter(temp) || (upperCase && !Character.isUpperCase(temp))) {
                    temp -= 26;
                }
            }
            builder.append(temp);
        }

        System.out.println(builder.toString());*/
        System.out.println(cipher("AB C" ,3));
    }


    static String cipher(String msg, int shift){
        String s = "";
        int len = msg.length();
        for(int x = 0; x < len; x++){

            char c = (char)(msg.charAt(x) - shift);
            if(Character.isAlphabetic(c)){
                if (c < 'A')
                    s += (char)(msg.charAt(x) + (26-shift));
                else
                    s += (char)(msg.charAt(x) - shift);
            }else{
                s +=c;
            }

        }
        return s;
    }


    private static int checkSubString(String s1, String s2) {
 /*     int length = subString.length();
        if(stringValue.length() < subString.length())
            return false;
        int index=0;
        int parentCounter=0;
        int per =0;
        for(char c : stringValue.toCharArray()){
            if(index < length && c == subString.charAt(index) && per == parentCounter-1){
                index++;
                per = parentCounter;
            }

            parentCounter++;
        }
        if(length == index){
            return true;
        }
        return false;*/

        int counter = 0; //pointing s2
        int i = 0;
        for(;i<s1.length();i++){
            if(counter==s2.length())
                break;
            if(s2.charAt(counter)==s1.charAt(i)){
                counter++;
            }else{
                //Special case where character preceding the i'th character is duplicate
                if(counter>0){
                    i -= counter;
                }
                counter = 0;
            }
        }
        return counter < s2.length()?-1:i-counter;
    }
}
