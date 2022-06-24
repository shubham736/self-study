package program.string;

import java.util.*;

public class DuplicateCharFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(duplicateCharFromString(str));
    }

    static StringBuilder duplicateCharFromString(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (char c : chars) {
            if(map.get(c) == null){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
                builder.append(c +",");
            }
        }
        int size = builder.length();
        builder.replace(size-1,size,"");
/*        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            countBuilder.append(entry.getKey()+" --> "+entry.getValue()+"\n");
        }
        int size1 = countBuilder.length();
        countBuilder.replace(size1-1,size1,"");*/
        return builder;
    }

    static StringBuilder method2duplicateCharFromString(String s) {
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toLowerCase().toCharArray();
        Arrays.sort(chars);
        for (int i =0;i<chars.length-1;i++){
            if(chars[i] == chars[i+1]){
                builder.append(chars[i] +",");
            }
        }
        int size = builder.length();
        builder.replace(size-1,size,"");
        return builder;
    }
}
