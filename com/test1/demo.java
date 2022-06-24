package com.test1;

public class demo {

    public static void main(String[] args) {
        Student student = new Student();
        //student.getName();
        String abc="sdfs";
        Object x= abc;
foo1();
    }
    public  static  void foo1()  {
        try {
            throw new RuntimeException();
        }
        finally {
            System.out.println("FFFFFFFFFF");
        }
    }
    public  static  void foo(){
        try{
           throw new Exception();
        }catch(MyException me){
            System.out.println("mmmmmmm");
        }
        catch (Exception e){
            System.out.println("hhhhhhhhhh");
        }
    }
}

 class MyException  extends Exception{
}

