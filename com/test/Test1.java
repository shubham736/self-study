package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public  static  int value=10;
    public static void main(String[] args) {
     /*   Integer[] arr = {1,3,5,7,4};
        List<Integer> listArr = Arrays.asList(arr);
        Collections.sort(listArr);
       // listArr.forEach(System.out::println);
        System.out.println(listArr.get(1));*/

     String str = "abc def ghi";
     String output ="";
     String[] strings = str.split(" ");
     //List<String>  strings1 = Arrays.asList(strings);
        for (String s : strings ){

        }
/*     for (String s : strings){
         String s1 = "";
         for (int i=0;i<s.length();i++){
             s1 = s1+ s.charAt(s.length()-i-1);
         }
         output = output + s1+" ";
     }*/
        System.out.println(output.trim());




    }
}
