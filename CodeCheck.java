public class CodeCheck {
    public static void main(String[] args) {
    /*       int i =0,s =0;
        while(i<100){
            s = s+i;
            s = i+s;
            i+=1;

        }
        System.out.println(s);
    */

/*    for(int i = 0; i<6;i++ ){
        System.out.print(print(i)+" ");
    }*/

        //System.out.println(fib(6));

        System.out.println(fun(100, 2000));
    }

    private static int print(int i) {
        if (i == 0 || i == 1 || i == 2)
            return 0;
        if (i == 3)
            return 1;
        return print(i - 1) + print(i - 2) + print(i - 3);
    }

    private static int fib(int i) {
        if (i <= 1)
            return i;
        return fib(i - 1) + fib(i - 2);
    }

    private static int fun(int a, int b) {
        if (b == 0)
            return a;
        return fun(a, a % b);
    }
}
