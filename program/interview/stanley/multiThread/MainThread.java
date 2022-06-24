package program.interview.stanley.multiThread;

public class MainThread extends Thread{
    private  static  int x;
    public synchronized void doThings(){
        int current = x;
        current ++;
        x = current;
        System.out.println(x);
    }
    public void run(){
        doThings();
    }

    public static void main(String[] args) {
        //MainThread thread = new MainThread();
       // thread.start();
        new MyThread().start();
        new MyThread(new MyRunnable()).start();
    }
}

class MyThread extends Thread{
    MyThread(){}
    MyThread(Runnable runnable){
        super(runnable);
    }
    public void run(){
        System.out.println("Inside Thread");
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside Runnable ");
    }
}


