package program.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MissingNumberInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the EndRange value: ");
        int n = sc.nextInt();
        Integer[] inputArray = new Integer[n];
        System.out.println("Enter (EndRange-1) numbers: ");
        for (int i = 0; i < n - 1; i++) {
            inputArray[i] = sc.nextInt();
        }
        int missingNumber = sumOfInputRange(n) - sumOfInputValue(inputArray);
        System.out.println("Missing number is : " + missingNumber);
    }

    static int sumOfInputValue(Integer[] ints) {
        return Arrays.stream(ints).mapToInt(Integer::intValue).sum();
    }

    static int sumOfInputRange(int endRange) {
        return (endRange * (endRange + 1)) / 2;
    }
}
