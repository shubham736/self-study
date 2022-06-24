package program.interview;

public class CountCurrency {

    // function to count and
    // print currency notes
    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int len =notes.length;
        int[] noteCounter = new int[len];

        // count notes using Greedy approach
        for (int i = 0; i < len; i++) {
            if (amount !=0 && amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < len; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }
    // driver function
    public static void main(String argc[]){
        int amount = 4500;
        countCurrency(amount);
    }
}
