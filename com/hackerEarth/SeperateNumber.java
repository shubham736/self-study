package com.hackerEarth;

import java.util.HashMap;
import java.util.Scanner;

public class SeperateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // findEffectedPerson(scanner);
        String value = scanner.nextLine();
        System.out.println(isSpecialNumber(value));

    }

    private static void findEffectedPerson(Scanner scanner) {
        String virusName = scanner.nextLine();
        int totalSample = scanner.nextInt();
        String[] strings = new String[totalSample];
        for (int i = 0; i < totalSample; i++) {
            strings[i ] = scanner.next();
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 1;
        for (Character character : virusName.toCharArray()) {
            if(map.get(character) == null){
                map.put(character, i++);
            }
        }
        String[] strings1 = checkEffected(strings, map, totalSample);
        for (String s : strings1){
            System.out.println(s+ " ");
        }
    }

    private static  String[] checkEffected(String[] strings, HashMap<Character, Integer> map, int size) {
        String[] result = new String[size];
        int currentIndex = -1;
        int index = 0;
        int flag=0;
        for (String name : strings) {
            for (int i = 0; i < name.length(); i++) {
                Integer value = map.get(name.charAt(i));
                if (map.containsKey(name.charAt(i)) && value >= currentIndex) {
                    currentIndex = value;
                }else{
                    flag = 2;
                    break;
                }
                if(i == name.length()-1)
                    flag =1;
            }
            currentIndex =-1;
            if(flag ==1)
                result[index] = "Positive";
            else if(flag == 2)
                result[index] = "Negative";
            flag =0;
            index ++;
        }
        return result;
    }

    public static boolean isSpecialNumber(String number) {
        char[] chars = number.toCharArray();
        int pervious = -1;
        int flag= 0;
        for (int i = 0 ; i < chars.length ; i++ ) {
            int value = Integer.valueOf(chars[i]);
            if(value < 9){
                pervious = value;
                int compare= (int)chars[i+1];
                if(pervious+1 == compare)
                    continue;
                else
                   flag = 1;
            }else if(value == 9){
                pervious = value;
                String  s = String.valueOf(chars[i+1] + chars[i+2]);
                int compare= Integer.valueOf(s);
                if(value+1 == compare){
                    continue;
                }else
                    flag = 1;
            }
            pervious = -1;
        }
        if (flag ==1)
            return false;
        return true;
    }
}
