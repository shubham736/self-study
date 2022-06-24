package program.makeMyTrip;

public class NThreads {

    final static int NUMBERS_IN_SEQUENCE = 24;
    final static int NUMBER_OF_THREADS = 3;
    public static void main(String[] args) throws InterruptedException {
        SharedPrinter sp = new SharedPrinter(NUMBERS_IN_SEQUENCE, NUMBER_OF_THREADS);
        // Creating 3 threads
        Thread t1 = new Thread(new SeqRunnable(sp, 1), "Thread1");
        Thread t2 = new Thread(new SeqRunnable(sp, 2), "Thread2");
        Thread t3 = new Thread(new SeqRunnable(sp, 0), "Thread3");
        Thread t4 = new Thread(new SeqRunnable(sp, 0), "Thread4");
        Thread t5 = new Thread(new SeqRunnable(sp, 0), "Thread5");
        Thread t6 = new Thread(new SeqRunnable(sp, 0), "Thread6");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}
class SharedPrinter{
    int number = 1;
    int numOfThreads;
    int numInSequence;
    SharedPrinter(int numInSequence, int numOfThreads){
        this.numInSequence = numInSequence;
        this.numOfThreads = numOfThreads;
    }
    public void printNum(int result){
        synchronized(this) {
            while (number < numInSequence - 1) {
                while(number % numOfThreads != result){
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " - " + number++);
                this.notifyAll();
            }
        }
    }
}
class SeqRunnable implements Runnable{
    SharedPrinter sp;
    int result;
    SeqRunnable(SharedPrinter sp, int result){
        this.sp = sp;
        this.result = result;
    }
    @Override
    public void run() {
        sp.printNum(result);
    }
}
