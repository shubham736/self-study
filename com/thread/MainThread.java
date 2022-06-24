package com.thread;

public class MainThread {

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        thread1.run();
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(" main thread");
        }
    }
}

class  MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(" child thread");
        }
    }
}