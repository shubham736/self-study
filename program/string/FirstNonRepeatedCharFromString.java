package program.string;

import java.util.*;

public class FirstNonRepeatedCharFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(firstNonRepeatedCharFromString(str));
    }

    private static char firstNonRepeatedCharFromString(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        LinkedHashMap <Character, Integer> map = new LinkedHashMap<>();
        for (char c : chars) {
            if(map.get(c) == null){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
        for(Map.Entry<Character, Integer>  entry : map.entrySet()){
            if(entry.getValue() == 1){
                return  entry.getKey();
            }
        }
        return ' ';
    }
}
