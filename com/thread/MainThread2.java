package com.thread;

public class MainThread2  {
    public static void main(String[] args) {
        MyThread1 thread2 = new MyThread1();
        thread2.start();
    }
}
class MyThread1 extends Thread{
// Without over loading run() method no output

}
