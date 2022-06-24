package program.interview.stanley.garbgeCollector;

public class X {
// here 2 obje3ct wiil be gc after line 8
    static X getInstance( X mx){
         mx= new X();
         return mx;
    }

    public static void main(String[] args) {
        X x = new X();
        X x2 = getInstance(x);
        X x4 = new X();
        x2 = x4;
        doComplexStuff();
    }

    private static void doComplexStuff() {
    }
}


// here 2 object c1 AND C3 will be gc at end
class CardBoard {
    Short story = 5;
    CardBoard go(CardBoard board){
        board = null;
        return board;
    }

    public static void main(String[] args) {
        CardBoard c1 = new CardBoard();
        CardBoard c2 = new CardBoard();
        CardBoard c3 = c1.go(c2);
        c1 = null;
        //Runtime.getRuntime().freeMemory();
        //System.gc();
        System.out.println("C1 "+c1);
        System.out.println("C2 "+c2);
        System.out.println("C3 "+c3);
        //do stuff
    }


}
