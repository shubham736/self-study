package program.interview;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {23, 34, 54, 44, 1, 2, 3, 4};
        Arrays.sort(a);
        int size = a.length - 1;
        int value = 1;
        if (isPresent(a, 0, size, value)) {
            System.out.println("Value is Present");
        } else {
            System.out.println("Value is  not Present");
        }
    }

    static boolean isPresent(int[] a, int intialValue, int size, int value) {

        if (size >= 1) {
            int middleValue = intialValue + (size - intialValue) / 2;
            if (a[middleValue] == value)
                return true;
            if (a[middleValue] > value)
                return isPresent(a, intialValue, middleValue - 1, value);
            return isPresent(a, middleValue + 1, size, value);
        }
        return false;
    }
}
