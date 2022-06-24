package self.Test;

import java.io.IOException;


/*5 class A
{
void m1() throws IOException
{
    System.out.println("In m1 A");
}
}
class B extends A
{
void m1() throws Exception
{
    System.out.println("In m1 B");
}
}*/
public class TestDemo {

    /*  4 {
        System.out.println("Instance Block");
    }
    public void meth()
    {
        System.out.println("Method");
    }
    public void Main()
    {
        System.out.println("Constructor");
    }
    static {
        System.out.println("static block");
    }*/
/*    static String name;
    public TestDemo(){
        name="Sara";
    }*/

 /* 1  public void fun(){
        System.out.println("A");
    }

    public class B extends TestDemo{
        public void fun() throws IOException {
            System.out.println("B");
        }*/


/*  3  TestDemo(int a, int b)
    {
        System.out.println("a = "+a+" b = "+b);
    }
    TestDemo(int a, float b)
    {
        System.out.println("a = "+a+" b = "+b);
    }*/
    public static void main(String[] args) {

  /*  5    A a=new B();
        try {
            a.m1();
        } catch (IOException e) {
            e.printStackTrace();
        } */

      /* 4 TestDemo ob = new TestDemo();
        ob.Main();
        ob.meth();*/
      /*  3  byte a = 10;
        byte b = 15;
        TestDemo test = new TestDemo(a,b);*/

        // 2 System.out.println(name);

  /* 1      try{ new B().fun();}
        catch(Exception e){
            System.out.println("Exception");
        }*/

  /*      try {
            args = null;
            args[0] = "test";
            System.out.println(args[0]);
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (NullPointerException np) {
            System.out.println("NullPointerException");
        }*/

    /*    int i=2;
        for(int j=0;i<=11;j++){
            i*=j;
            System.out.println(++i);
        }*/


    /*    int array[] = {1, 2, 3, 4};
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array[i]);
        }*/

     /*   int input = 12;
        int size = 7;
        printPattern(size);*/
     /*   Integer a=null;
        int b=a;
        System.out.println(b);*/

/*        if(checkPowerByTwo(input)){
            System.out.println("Number is power of 2");
        }else{
            System.out.println("Number is not power of 2");
        }*/
  /*      List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        List <Integer> list1 = list.stream().filter(e -> e%2==0).collect(Collectors.toList());
        list1.stream().forEach(System.out::println);*/

    }

    private static void printPattern(int size) {
        for (int i = 0; i <= size; i = i + 2) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    private static boolean checkPowerByTwo(int input) {
        float result = input;
        while (result > 1) {
            result = result / 2;
            if (result == 1)
                return true;
        }
        return false;
    }


}
