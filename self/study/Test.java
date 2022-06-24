package self.study;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        // print even no between 1 to 100
        IntStream.iterate(1, o->o+1).filter(n->n%2==0).limit(50).forEach(System.out::println);
       // System.cout.println((1,2)->1+2);
        if (checkNumber(12321))
            System.out.println("True");
        else
            System.out.println("False");

    }
    public static boolean checkNumber(int n){
        String str = String.valueOf(n);
        int  length  = str.length();
        char [] chars = str.toCharArray();
        for(int i = 0 ; i <=length/2 ; i++){
            if(chars[i] != chars[length-1-i])
                return false;
        }
        return true;
    }
}
