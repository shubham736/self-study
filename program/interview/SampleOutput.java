package program.interview;

import java.util.HashSet;

import static  com.test.Test1.value;

public class SampleOutput implements  Runnable {
    private  String s;
    SampleOutput(String s){
        this.s = s;
    }
    SampleOutput(){

    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try{
            for(int i =0;i<4;i++){
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            }
        }catch (Exception e){

        }
    }
    private int number=0;

    public static void main(String[] args) throws InterruptedException {
/*
        // Question 4
        number++;
        System.out.println(number);*/


/*      SampleOutput s = new SampleOutput();
        Thread t =new Thread(s,"A");
        Thread t1 =new Thread(s,"B");
        t.start();
        t.join();
        t1.start();*/

/*
        // Question 5
        System.out.println(value);
*/
    /*    // Question {1,2,3}
        value();*/

        // Question 6
        String a= "shubham";
        String b= "gupta";
        String s1 = a.concat(b);
        String s2 = a + b;
        System.out.println("S1 :- "+s1 + " S2 :- "+s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }

    public static  void  value(){
        // Question 1
        HashSet hs = new HashSet();
        SampleOutput sO1 = new SampleOutput("abc");
        SampleOutput sO2 = new SampleOutput("abc");
        String s1 = new String("abc");
        String s2 = new String("abc");
        hs.add(sO1);
        hs.add(sO2);
        hs.add(s1);
        hs.add(s2);
        System.out.println(hs.size());

        // Question 2
        String s3 = "abc";
        System.out.println(s2==s3);

        // Question 3
        int[] num = new int[]{1,2,3};
        System.out.println(num[1]);
    }
}
