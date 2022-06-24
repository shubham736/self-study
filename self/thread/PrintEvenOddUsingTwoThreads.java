package self.thread;

public class PrintEvenOddUsingTwoThreads {
    static  int counter =1;
    static  int n;
    public static void main(String[] args) {
        n =10;
        PrintEvenOddUsingTwoThreads threads = new PrintEvenOddUsingTwoThreads();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threads.printEvenNumber();
            }


        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threads.printOddNumber();
            }
        });

        t1.start();
        t2.start();
    }

    private  void printOddNumber()  {
        synchronized (this){
            while(counter < n){
                if(counter % 2 == 0){
                    try {
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.print(counter +" ");
                counter++;
                notify();
            }
        }

    }
    private  void printEvenNumber()  {
        synchronized (this){
            while (counter < n) {
                if (counter % 2 != 0) {
                    try {
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.print(counter +" ");
                counter++;
                notify();
            }
        }

    }
}
