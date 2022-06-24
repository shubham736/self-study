package program.interview.lenskart;

public class MaximunOccurance {

    static int R = 5;
    static int C = 5;

    public static void main(String[] args) {
        int[][] ints = {{1, 1, 1, 1, 0},
                {1, 1, 1, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {1, 1, 1, 1, 0}};
      /*  int row_number = findRowWithMaxZero(ints);
        System.out.println(row_number);*/
        findRowNumberWithMaxZero(ints);
    }

    // Function to find the index of first 1
// in the binary array arr[]
    static int first(int arr[], int low, int high) {
        if (high >= low) {

            // Get the middle index
            int mid = low + (high - low) / 2;

            // Check if the element at middle index is first 1
            if ((mid == 0 || arr[mid - 1] == 0) && arr[mid] == 1)
                return mid;

                // If the element is 0, recur for right side
            else if (arr[mid] == 0)
                return first(arr, (mid + 1), high);

                // If element is not first 1, recur for left side
            else
                return first(arr, low, (mid - 1));
        }
        return -1;
    }

    // Function to print rows with maximum
// and minimum number of zeroes
    static void findRowNumberWithMaxZero(int mat[][]) {
        int max_row_index = 0, max = Integer.MIN_VALUE;

        int min_row_index = 0, min = Integer.MAX_VALUE;

        int i, index;

        for (i = 0; i < R; i++) {
            index = first(mat[i], 0, C - 1);

            int cntZeroes = 0;

            // If index = -1, that is there is no 1
            // in the row, count of zeroes will be C
            if (index == -1) {
                cntZeroes = C;
            }

            // Else, count of zeroes will be index
            // of first 1
            else {
                cntZeroes = index;
            }

            // Find max row index
            if (max < cntZeroes) {
                max = cntZeroes;
                max_row_index = i;
            }

            // Find min row index
            if (min > cntZeroes) {
                min = cntZeroes;
                min_row_index = i;
            }
        }

        System.out.println("Row with min 0s: " + (min_row_index + 1));
        System.out.println("Row with max 0s: " + (max_row_index + 1));
    }


    private static int findRowWithMaxZero(int[][] ints) {
        int index = 0;
        int highest = -1;
        int counter = 0;

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] == 0) {
                    counter++;
                    if (counter > highest) {
                        highest = counter;
                        index = i;
                    }
                }
            }
            counter = 0;
        }
        return index + 1;
    }
}