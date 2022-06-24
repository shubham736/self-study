package program.interview.stanley.exception;

public class TestException {
    public static void main(String[] args) {
        ques1();
        ques2();
    }

    static void ques2(){
        try{
            throw new Ex1();
        }catch(Ex0 ex0){
            System.out.println("Ex0 block");
        }catch (Exception e){
            System.out.println("Exception block");
        }
    }

    static  void ques1(){
        try{
            errorMethod();
            System.out.println("try block");
        }catch (Exception e){
            System.out.println("catch block");
        }finally {
            System.out.println("finally block");
        }
        System.out.println("Main block");
    }

    static  void errorMethod(){
        throw new Error();
    }
}
class Ex0 extends Exception{}
class Ex1 extends Ex0{}
