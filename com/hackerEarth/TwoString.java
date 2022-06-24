package com.hackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TwoString {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> a = new ArrayList<>();
        for (int i = 0; i < aCount; i++) {
            String aItem = bufferedReader.readLine();
            a.add(aItem);
        }

        int bCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> b = new ArrayList<>();
        for (int i = 0; i < bCount; i++) {
            String aItem = bufferedReader.readLine();
            b.add(aItem);
        }

        checkString(a, b);
    }

    static void checkString(List<String> a, List<String> b) {
      /*  a.retainAll(b);
        System.out.println((a.isEmpty()) ? "NO" : "YES");*/
        Map<Integer, String[]> integerMap = new HashMap<>();

        int aSize = a.size();
        int bSize = b.size();
        int size;
        if (aSize > bSize) {
            size = aSize;
        } else {
            size = bSize;
        }
        for (int i = 0; i < size; i++) {
            String[] strings = new String[2];
            if(a.get(i) !=null){
                strings[0] = a.get(i);
            }else{
                strings[0] = "";
            }
            if(b.get(i) != null){
                strings[1] = b.get(i);
            }else{
                strings[1] = "";
            }
            integerMap.put(i,strings);
        }
        for(Map.Entry<Integer , String[]> entry : integerMap.entrySet()){
            String[] strings = entry.getValue();
            if(checkSunString(strings[0].toLowerCase() ,strings[1].toLowerCase())){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }


    }

    private static boolean checkSunString(String s1, String s2) {
        int MAX_CHAR = 26;
        // vector for storing character occurrences
        boolean v[] = new boolean[MAX_CHAR];
        Arrays.fill(v, false);

        // increment vector index for every
        // character of str1
        for (int i = 0; i < s1.length(); i++)
            v[s1.charAt(i) - 'a'] = true;

        // checking common substring of str2 in str1
        for (int i = 0; i < s2.length(); i++)
            if (v[s2.charAt(i) - 'a'])
                return true;
        return false;
    }
}
