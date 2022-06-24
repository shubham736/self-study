package com.hackerEarth;

import java.io.IOException;
import java.util.Scanner;

public class SherlockAndValidString {
    //Complete the isValid function below.
    static boolean isValid(String s) {

/*        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (Integer integer : map.values()) {
            if (integerMap.get(integer) == null) {
                integerMap.put(integer, 1);
            } else {
                integerMap.put(integer, integerMap.get(integer) + 1);
            }
        }
        for (Integer integer : integerMap.values()) {
            if (integer == 1)
                return "YES";
        }
        return "NO";*/

        char[] str = s.toCharArray();

        int m = 256, n = str.length + 1;
        int[] cnt = new int[m];
        for (char c : str) {
            ++cnt[c];
        }

        int[] f = new int[n];

        for (int val : cnt) {
            ++f[val];
        }

        int x = 0;
        for (int i = 1; i < n; i++) {
            if (f[i] > 0) {
                ++x;
            }
        }

        if (x == 1) {
            return true;
        }

        if (x > 2) {
            return false;
        }

        int y = 0;

        for (int i = 2; i < n; i++) {
            if (f[i] > 0) {
                ++y;
            }
        }

        if (y == 1 && f[1] == 1) {
            return true;
        }

        int z = 0;

        for (int i = 2; i < n; i++) {
            if (f[i] == 1 && f[i - 1] > 0) {
                ++z;
            }
        }

        return z == 1;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean result = isValid(scanner.nextLine());
        if(result)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

/*   Method 2
public class SherlockAndValidString extends PrintWriter {

    boolean solve() {

        char[] str = nextLine().toCharArray();

        int m = 256, n = str.length + 1;
        int[] cnt = new int[m];
        for (char c : str) {
            ++cnt[c];
        }

        int[] f = new int[n];

        for (int val : cnt) {
            ++f[val];
        }

        int x = 0;
        for (int i = 1; i < n; i++) {
            if (f[i] > 0) {
                ++x;
            }
        }

        if (x == 1) {
            return true;
        }

        if (x > 2) {
            return false;
        }

        int y = 0;

        for (int i = 2; i < n; i++) {
            if (f[i] > 0) {
                ++y;
            }
        }

        if (y == 1 && f[1] == 1) {
            return true;
        }

        int z = 0;

        for (int i = 2; i < n; i++) {
            if (f[i] == 1 && f[i - 1] > 0) {
                ++z;
            }
        }

        return z == 1;
    }

    void run() {
        println(solve() ? "YES" : "NO");
    }

    int[][] nextMatrix(int n, int m) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = nextInt();
        return matrix;
    }

    String next() {
        while (!tokenizer.hasMoreTokens())
            tokenizer = new StringTokenizer(nextLine());
        return tokenizer.nextToken();
    }

    boolean hasNext() {
        while (!tokenizer.hasMoreTokens()) {
            String line = nextLine();
            if (line == null) {
                return false;
            }
            tokenizer = new StringTokenizer(line);
        }
        return true;
    }

    int[] nextArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = nextInt();
        }
        return array;
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException err) {
            return null;
        }
    }

    public SherlockAndValidString(OutputStream outputStream) {
        super(outputStream);
    }

    static BufferedReader reader;
    static StringTokenizer tokenizer = new StringTokenizer("");
    static Random rnd = new Random();

    public static void main(String[] args) throws IOException {
        SherlockAndValidString solution = new SherlockAndValidString(System.out);
        reader = new BufferedReader(new InputStreamReader(System.in));
        solution.run();
        solution.close();
        reader.close();

    }
}*/
