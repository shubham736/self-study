package com.inheritance;

public class Example4 {
    public static void main(String[] args) {
        Goo goo = new Goo();
        Foo foo = goo;
        foo.f();
        goo.g();
        goo.f();
    }
}

class Foo{
    void f(){
        System.out.println("f");
    }
}
class Goo extends Foo{
    void g(){
        System.out.println("g");
    }
}