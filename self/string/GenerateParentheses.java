package self.string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n =3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        if(n <1)
            return list;
        generatePar(n,n,list,new String(""));

        return list;
    }

    public static void generatePar(int openingIndex, int closingIndex, List<String> list, String s){
        //openingIndex -> number of opening brackets available
        //closingIndex -> number of closing brackets available

        if(openingIndex == closingIndex){           //must take only opening bracket
            s += '(';
            openingIndex--;
        }

        if(openingIndex == 0 && closingIndex > 0){  //must take only closing brackets
            while(closingIndex != 0){
                s += ')';
                closingIndex--;
            }
            list.add(s);
            return;
        }

        //two possibilities:
        generatePar(openingIndex-1,closingIndex,list,s+'(');    //1. we choose opening bracket
        generatePar(openingIndex,closingIndex-1,list,s+')');    //2. we choose closing bracket
    }
}
