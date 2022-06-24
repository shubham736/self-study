package com.inheritance;

class Parent1 {
    public int a = 9;
    protected int b = 10;

    public Parent1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    protected  void sum(int a, int b){
        new Parent1(a,b).get();
    }
    private void get() {
        System.out.println(a + b);
    }

}

class Child extends Parent1 {
/*    private Child(int a, int b) {
        super(a, b);
    }*/
// compile time error as because constructor is private

    Child(int a, int b) {
        super(a, b);
    }
    protected void add() {
        sum(10, 20);
    }
}

public class Example2 {
    public static void main(String[] args) {
        new Child(2, 3).add();
    }
}
