package self;

import java.util.Scanner;

public class PrintExpDivisbleBy101 {
    static final int FACTOR = 101;

    static int N;
    static int[] A;
    static char[] B;

    static boolean printExpression(int res, int count) {
        int mod = res % FACTOR;

        if (count == N - 1) {
            if (mod == 0) {
                return true;
            }
            return false;
        }

        if (printExpression(mod * A[count + 1], count + 1)) {
            B[count] = '*';
            return true;
        }

        if (printExpression(mod + A[count + 1], count + 1)) {
            B[count] = '+';
            return true;
        }

        int auxRes = mod - A[count + 1];
        if (printExpression(auxRes, count + 1)) {
            B[count] = '-';
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        B = new char[N - 1];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        printExpression(A[0], 0);
        System.out.print(A[0]);
        for (int i = 0; i < N - 1; i++) {
            System.out.print(B[i] + "" + A[i + 1]);
        }
        System.out.println();

        sc.close();
    }
}
