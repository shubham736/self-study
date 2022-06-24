package program.makeMyTrip;

import java.util.TreeMap;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(9));
        System.out.println(sqrt(9));

    }

    private static double sqrt(double X) {
        for (int i = 1; i < X; ++i) {
            int p = i * i;
            if (p == X) {
                // perfect square
                return i;
            }
            if (p > X) {
                // found left part of decimal
                return sqrt(X, i - 1, i);
            }
        }
        return Double.NaN;
    }


    private static double sqrt(double X, double low, double high) {
        double mid = (low + high) / 2;
        double p = mid * mid;
        // uncomment below line to see how we reach the final answer
        // System.out.println(low + " " + high + " " + mid + " " + p);

        int PRECISION =0; // error
        if (p == X || (Math.abs(X - p) < PRECISION)) {
            return mid;
        }
        if (p < X) {
            return sqrt(X, mid, high);
        }
        return sqrt(X, low, mid);
    }

}
