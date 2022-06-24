package codeChef.math;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main (String[] args) throws java.lang.Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c=  Integer.parseInt(reader.readLine());
        while(c-- > 0){
            String n = reader.readLine();
            StringBuilder builder = new StringBuilder();
             for( int i=n.length()-1 ; i>=0  ; i--){
                 builder.append(n.charAt(i));
             }
            System.out.println(builder);
        }


/*           InputStream inputStream = System.in;
            InputStreamReader in = new InputStreamReader(inputStream);
            int t = in.nextInt();
            while (t-- > 0) {
                int n = in.nextInt();
                int last = n % 10;

                while (n > 9) {
                    n /= 10;
                }

                System.out.println(n + last);
            }
        } catch (Exception e) {
            return;
        }*/
    }

}
