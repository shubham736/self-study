package com.designPattern;

 public class Singleton implements  Cloneable{


    private  static  Singleton instance = null;
    public String s;
    private Singleton(){
        s = "A string part of Singleton class";
    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                return  new Singleton();
            }
        }
        return instance;
    }
     protected Object clone() throws CloneNotSupportedException {
         return new CloneNotSupportedException();
     }

     public static void main(String[] args) throws CloneNotSupportedException {
         Singleton x = Singleton.getInstance();

         // Instantiating Singleton class with variable y
         Singleton y = Singleton.getInstance();

         // Instantiating Singleton class with variable z
        // Singleton z =(Singleton) y.clone();  -- object cloning
         Singleton z = Singleton.getInstance();


         // Printing the hash code for above variable as
         // declared
         System.out.println("Hashcode of x is "
                 + x.hashCode());
         System.out.println("Hashcode of y is "
                 + y.hashCode());
         System.out.println("Hashcode of z is "
                 + z.hashCode());

         // Condition check
         if (x == y && y == z) {

             // Print statement
             System.out.println(
                     "Three objects point to the same memory location on the heap i.e, to the same object");
         } else {
             // Print statement
             System.out.println(
                     "Three objects DO NOT point to the same memory location on the heap");
         }
         if ( y == z) {

             // Print statement
             System.out.println(
                     "Two objects point to the same memory location on the heap i.e, to the same object");
         }
     }
}

