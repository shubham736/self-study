package program.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringContainsOnlyDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        stringContainsOnlyDigits(str);
    }

    static  String stringContainsOnlyDigits(String s){
        /*
        *  ^ starts
        *  * zero or n chars
        *  + one or more chars
        *  $  ends
        *  [0-9] Number between 0 t0 9
        *  [a-zA-Z]  lower or uppercase alphabets
        *  [0-9]{2}  first 2 digits should be number
        */

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

}
