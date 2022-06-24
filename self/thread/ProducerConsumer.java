package self.thread;

import self.ds.linkedList.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ProducerConsumer {
     static int capacity= 2;
    public static void main(String[] args) throws InterruptedException {
        PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // starts threads
        t1.start();
        t2.start();

        // join -- one threads complete than another starts
        t1.join();
        t2.join();
    }
    public static class PC{
        Stack<Integer> stack = new Stack<>();
        private void producer() throws InterruptedException {
            int value =0;
            synchronized (this){
                while(true){
                    if(capacity == stack.size()) {
                      wait();
                    }
                    System.out.println("Producer value "+value);
                    stack.push(value++);
                    notify();
                    Thread.sleep(1000);
                }
            }

        }

        private void consumer() throws InterruptedException {
            synchronized (this){
                while (true){
                    if(stack.size() ==0)
                        wait();
                    int value = stack.pop();
                    System.out.println("Consumer value" +value);
                    notify();
                    Thread.sleep(1000);

                }
            }
        }
    }
}

