package program.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AshleyMathsProdigy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        MyClass solver = new MyClass();
        while (i-- > 0) {
            int i1 = scanner.nextInt();
            int i2 = scanner.nextInt();
            System.out.println(solver.solve(i1, i2));
        }
    }
}

class MyClass {
    int solve(int m, int n) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = m; i <= n; i++) {
            if (integerMap.get(i) == null) {
                if (i == 0 || i == 1 || i == 2) {
                    integerMap.put(i, 0);
                } else if(i ==3) {
                    integerMap.put(i, 1);
                }else{
                    int sum = 0;
                    for(int j =3 ;j<i ;j++ ){
                        sum +=integerMap.get(j);
                    }
                    integerMap.put(i,sum);
                }
            }
        }
        int sum =0;
        for(Integer integer : integerMap.values()){
            sum+=integer;
        }
        return sum;
    }
}




