package self.string;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Solution {


    /*
     * Complete the 'passwordCracker' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY passwords
     *  2. STRING loginAttempt
     */
    private static Stack<String> password;
    private static Set<String> badLoginAttempt;

    private static boolean calc(String[] pass, String loginAttempt) {
        if (badLoginAttempt.contains(loginAttempt)) {
            return false;
        }
        if (loginAttempt.length() == 0) {
            return true;
        }
        for (String p : pass) {
            if (loginAttempt.startsWith(p) && calc(pass, loginAttempt.substring(p.length()))) {
                password.push(p);
                return true;
            }
        }
        badLoginAttempt.add(loginAttempt);
        return false;
    }

    public static String passwordCracker(List<String> passwords, String loginAttempt) {
        String[] pass = new String[passwords.size()];
        for (int i = 0; i < passwords.size(); i++) {
            pass[i] = passwords.get(i);
        }
        password = new Stack<>();
        badLoginAttempt = new HashSet<>();
        String org = "";
        boolean result = calc(pass, loginAttempt);
        if (result) {
            while (!password.isEmpty()) {
                org += password.pop() + " ";
            }
            return org.trim();
        } else {
            return "WRONG PASSWORD";
        }

    }

    public static String passwordCracker1(List<String> passwords, String loginAttempt) {
        // Write your code here

        String org = loginAttempt;
        for (String string : passwords) {
            loginAttempt = loginAttempt.replaceAll("bb", "");
        }
        if (loginAttempt.length() > 0) {
            return "WRONG PASSWORD";
        } else {
            for (String string : passwords) {
                org = org.replaceAll(string, string + " ");
            }
        }
        return org.trim();
    }

}

public class PasswordCracker {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("result.txt"));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> passwords = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList());

                String loginAttempt = bufferedReader.readLine();

                String result = Solution.passwordCracker(passwords, loginAttempt);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

