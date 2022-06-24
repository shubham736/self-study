package program.string;


import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reversed = reverseStringWithRecursion(str);
        System.out.println("The reversed string ( WithRecursion )   is: " + reversed);
        System.out.println("The reversed string (WithoutRecursion ) is: " + reverseString(str));
        Scanner scanner1 = new Scanner(System.in);

        String str1 = " abd def";
        String[] strings = str1.split(" ");
        for (String s : strings){
            System.out.println(s);
        }
}

    public static String reverseStringWithRecursion(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseStringWithRecursion(str.substring(1)) + str.charAt(0);
    }
    public static StringBuilder reverseString(String str){
        char[] chars = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(int i = chars.length-1 ; i >=0  ; i--){
            builder.append(chars[i]);
        }
        return builder;

    }
}
