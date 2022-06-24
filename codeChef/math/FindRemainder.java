package codeChef.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindRemainder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        for(int i=0; i< count;i++){
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            System.out.println(a%b);
        }
    }
}
