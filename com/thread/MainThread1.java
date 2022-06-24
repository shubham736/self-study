package com.thread;

public class MainThread1  {

    public static void main(String[] args) {
        Thread thread1 = new Thread("Thread1");
        Thread thread2 = new Thread("Thread2");
        thread1.start();
        thread2.start();
        System.out.println("Thread names are following:");
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
        Thread.currentThread().setName("Shubham-Thread");
        System.out.println(Thread.currentThread().getName());
    }
}
