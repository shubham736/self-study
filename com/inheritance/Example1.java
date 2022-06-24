package com.inheritance;

import java.io.IOException;

class Parent {
    public int a = 9;
    protected int b = 10;

    public Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Parent(String od) {
        orderID = od;
        System.out.println(orderID);
    }

    public Parent() {
        orderID = "0000A";
        System.out.println(orderID+"Parent");
    }

    /*    private void add() {
            System.out.println(a + b);
        }*/
// Since private can't be overridden hence  we need to use below one
    void add() {
        System.out.println(a + b);
    }

    public void m() throws IOException {
    }

    String orderID;


}

public class Example1 extends Parent {
    String orderID;

    public Example1() {
        orderID = "xxA";
        System.out.println(orderID+" EX");
    }

    private Example1(int a, int b) {
        super(a, b);
    }

    public Example1(String od) {
        orderID = od;
        System.out.println(orderID+"Example");
    }

    public void m() throws IOException { //error 2
        super.m();
        //  throw  new IOException();
    }


    public static void main(String[] args) throws IOException {
       // new Example1().m(); // error1
       // new Example1(2, 3).add();
        Example1 example1 = new Example1("hgfjk");
    }
}
