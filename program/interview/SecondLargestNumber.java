package program.interview;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] ints = {5, 1, 7, 3, 6, 8, 2};
        System.out.println(secondLargest(ints));
    }

    public static int secondLargest(int[] ints) {
        int size = ints.length;
        int temp ;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i-1; j++) {
                if (ints[j] > ints[j+1]) {
                    temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }

        }
        return ints[size - 2];
    }
}
