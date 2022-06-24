package program.interview;

import java.util.regex.Pattern;

public class StringRegx {
    public static void main(String[] args) {
        String str = "53Shubham1bham2";
        print(str.toLowerCase());
    }

    public static String  print(String s) {
        String regexNumber = "^[0-9]*$";
        String regexString = "^[a-zA-Z]*$";
        Pattern patternNumber = Pattern.compile(regexNumber);
        Pattern patternString = Pattern.compile(regexString);
        if(patternNumber.matcher(s).matches()){
            System.out.println("String contains only digits " );
            return "Number";
        }else if (patternString.matcher(s).matches()){
            System.out.println("String contains only char " );
            return "String";
        }else {
            System.out.println("String contains varchar " );
            return "Varchar";
        }

    }
    public static  String print1(String str){
        for(int i = 0 ; i< str.length()-1 ; i++){
            if (('a' <= str.charAt(i))  && (str.charAt(i) <= 'z')  ||
                    ('A' <= str.charAt(i))  && (str.charAt(i) <= 'Z') ){
                swap(str,  str.charAt(i-1) ,str.charAt(i) ,i);
            }
        }
        return "";
    }

    public static  void swap (String s, char i , char j ,int count){
        System.out.println((char )i + (char )j);
        i = (char) (i +j);
        j = (char) (i -j);
        i = (char) (i -j);
        System.out.println((char )i +(char ) j);
    }

}
