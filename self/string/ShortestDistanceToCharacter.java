package self.string;

import java.util.*;

public class ShortestDistanceToCharacter {
    public static int rearrangeCharacters(String s, String target) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.println(map);
        boolean flag = true;
        int counter = 0;
        while (flag) {
            for (int j = 0; j < target.length(); j++) {
                if (map.containsKey(target.charAt(j)) && map.get(target.charAt(j)) > 0) {
                    map.put(target.charAt(j), map.get(target.charAt(j)) - 1);
                    if (j == target.length() - 1) {
                        counter++;
                    }
                } else {
                    flag = false;
                    return counter;
                }
            }
        }
        return counter;
    }

    public static int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

        Map<String, Integer> count = new HashMap<>();
        int ans = 0;
        int n = s.length();

        for (int i = 0; i + minSize - 1 < n; i++) {
            String y = s.substring(i, i + minSize);
            count.put(y, count.getOrDefault(y, 0) + 1);

            int unique = uniqueCharactersInString(y);
            if (unique <= maxLetters) {
                ans = Math.max(ans, count.get(y));
            }
        }
        System.out.println(count);
        return ans;
    }

    static int uniqueCharactersInString(String y) {
        Set<Character> hs = new HashSet<>();
        for (int j = 0; j < y.length(); j++)
            hs.add(y.charAt(j));
        return hs.size();
    }

    public static String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack();
        for (char c : S.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        // System.out.println(rearrangeCharacters("abbaccaddaeea","aaaaa"));
        //  maxFreq("aaaa", 1,  3,  3);
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String a = s.next();
         //   String sd = String.valueOf(a);
            StringBuilder ss = new StringBuilder(a);
            ss = ss.reverse();
            if (a.equals(ss.toString()))
                System.out.println("wins");
            else
                System.out.println("loses");
        }



      /*  HashMap<String, String> map = new HashMap<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0 ;i< n;i++){
            map.put(s.next(),s.next());
        }
        for(Map.Entry<String, String> entry:map.entrySet()){
            String result="";
            for(int i = 0 ; i<5 ;i++){
                if(entry.getKey().charAt(i) == entry.getValue().charAt(i)){
                    result+="G";
                }else{
                    result+="B";
                }
            }
            System.out.println(result);
        }*/

    }


    int getIndex(String s, char c, int start) {
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int prev = getIndex(s, c, 0);
        int next = prev;

        for (int k = 0; k < s.length(); k++) {
            ans[k] = Math.min(Math.abs(k - prev), Math.abs(next - k));
            if (next == k) {
                prev = next;
                next = getIndex(s, c, k + 1);
            }
        }
        return ans;
    }

    void getShortestDistance() {
        String s = "aaba";
        String c = "b";
        int size = s.length();
        int[] first = new int[size];
        int[] sec = new int[size];
        Arrays.fill(sec, Integer.MAX_VALUE);
        Arrays.fill(first, Integer.MAX_VALUE);
        for (int i = 0; i < size; i++) {

            for (int j = i; j < size; j++) {
                if (s.charAt(j) == c.charAt(0)) {
                    first[i] = Math.abs(j - i);
                    break;
                }
            }
        }
        for (int i = size - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (s.charAt(j) == c.charAt(0)) {
                    sec[i] = Math.abs(j - i);
                    break;
                }
            }
        }
        System.out.println("First");
        Arrays.stream(first).forEach(System.out::print);
        System.out.println();
        System.out.println("Second");
        Arrays.stream(sec).forEach(System.out::print);
        for (int i = 0; i < first.length; i++) {
            first[i] = Math.min(first[i], sec[i]);
        }
        System.out.println();
        System.out.println("Result");
        Arrays.stream(first).forEach(System.out::print);
    }
}
