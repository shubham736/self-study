package com.hackerEarth;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail



import java.util.*;
// keluktlkxnbdswsdtphoulrbhyjhpmpscfliuqnynejgmfynwfolzbdoztclzbozqomvioszdppm
// /mppd/tlk/fwnyfm/bd/hptdsws\oulrbhyjhpmpscfliuqnynejg\nx\olzbdoztclzbozqomviosz\kulek\
public class AliceLibrary {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader

         */
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN*/
        String name= "/mppd/tlk/fwnyfm/bd/hptdsws\\oulrbhyjhpmpscfliuqnynejg\\nx\\olzbdoztclzbozqomviosz\\kulek\\";
        System.out.println(name.length());
        StringBuilder builder = rearrangeLibrary(name);// Writing output to STDOUT
        System.out.println(builder + "  " + builder.length());    // Writing output to STDOUT

        String s = "keluktlkxnbdswsdtphoulrbhyjhpmpscfliuqnynejgmfynwfolzbdoztclzbozqomvioszdppm";
        System.out.println(s + "  " + s.length());    // Writing output to STDOUT
        System.out.println(s.equals(builder));

/*        //Scanner
        Scanner s = new Scanner(System.in);
        String name1 = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi,,,, " + name1 + ".");    // Writing output to STDOUT
*/
        // Write your code here
        ;

    }

    static StringBuilder rearrangeLibrary(String str) {
        String temp = null;
        int counter = 0;
        LinkedHashMap<Integer, String> stringMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '/') {
                counter++;
                if (temp != null) {
                    stringMap.put(i, temp);
                    temp = null;
                }
            } else if (str.charAt(i) == '\\') {
                if (temp != null) {
                    stringMap.put(i, temp);
                    temp = null;
                }
            } else {
                if (temp == null)
                    temp = "" + String.valueOf(str.charAt(i));
                else
                    temp = temp + String.valueOf(str.charAt(i));
            }
        }
        // convert to ArrayList of key set
        List<Integer> alKeys = new ArrayList<Integer>(stringMap.keySet());

        // reverse order of keys
        Collections.reverse(alKeys);
        // get the key set

        Integer[] keyArray
                = alKeys.toArray(new Integer[alKeys.size()]);

        StringBuilder result = new StringBuilder();
        if (counter % 2 == 0) {
            for(int i = 0 ; i < keyArray.length-1 ; i++)
             {
                StringBuilder str1 = new StringBuilder((CharSequence) stringMap.get(keyArray[i]));
                if(i %2 == 0)
                    result.append(str1.reverse());
                else
                    result.append(str1);
            }
        } else {
            for(int i = 0 ; i < keyArray.length-1 ; i=i+1) {
                StringBuilder str1 = new StringBuilder((CharSequence) stringMap.get(keyArray[i]));
                if(i %2 == 0)
                    result.append(str1);
                else
                    result.append(str1.reverse());
            }
        }
    return  result;
    }

    static TreeMap sortHashMapOnKey(Map<Integer, String> hashMap) {
// TreeMap to store values of HashMap
        TreeMap<Integer, String> sorted = new TreeMap<>();

        // Copy all data from hashMap into TreeMap
        sorted.putAll(hashMap);
        return sorted;
    }

}

