package com.inheritance;

public class Example3 extends Cust {
    public Example3() {
        super("");
    }

    public static void main(String[] args) {
        //System.out.println(foo("hello world"));
    /*    try {
            com.inheritance.Example3 t = new com.inheritance.Example3();
            t.foo();
            System.out.println("Fissss");
        }catch (Exception e){}*/


    }


 /*   private void foo() {
        try {
            throw  new RuntimeException();
        }finally {
            System.out.println("Fina");
        }
    }*/


/*    private static String foo(String hello_world) {
        if (hello_world == null || hello_world.length()<=1){
            return hello_world;
        }
        char[] chars = hello_world.toCharArray();
        int ri = chars.length - 1;
        for (int l =0 ; l <ri ; l++ ){
            char s  = chars[l];
            chars[l]  = chars[ri];
            chars[ri--] = s;
        }
        return  new String(chars);
    }*/

/*    private static int foo(int i) {
        if (i ==0)
            return 1;
        return  recc(i ,1);
    }

    private static int recc(int i, int i1) {
        if (i == 1){
            return i1;
        }else
            return recc(1-1,i1*i);
    }*/

}

class Cust {
    private String a;

    public Cust(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}
