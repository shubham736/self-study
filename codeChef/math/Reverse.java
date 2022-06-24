package codeChef.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reverse {
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {}
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        try{

            FastScanner sc=new FastScanner();
            int n=sc.nextInt();
            int arr[]=new int[n];
            int r[]=new int[n];
            int rev;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                int num=arr[i];
                int res=0;
                while(num!=0)
                {
                    res=res*10+(num%10);
                    num/=10;
                }
                r[i]=res;
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(r[i]);

            }

        }catch(Exception e)
        {    return;
        }

    }
}
