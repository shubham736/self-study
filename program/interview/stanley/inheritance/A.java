package program.interview.stanley.inheritance;

public class A {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b instanceof B);
        System.out.println(b instanceof B && (!(b instanceof A)));
        System.out.println(b instanceof B && (!(b instanceof C)));
    }
}

class B extends A {
}

class C extends B {
}
