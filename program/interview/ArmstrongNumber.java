package program.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(getAstNo(i)){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
    public static boolean getAstNo(int n){

        int temp , sum =0 , rem, temp1;
        temp= n;
        temp1= n;
        int size=1;
        while (temp1 > 0){
            temp1 = temp1 /10;
            size++;
            if (temp1 >0 && temp1<9){
                break;
            }
        }
        while(n > 0){
            rem = n % 10;
            n = n /10;
            //sum = sum + (getRem(rem , size));
            sum = sum + (rem*rem*rem);
        }
        return (temp == sum);
    }

    public static int getRem(int rem , int size){
        for(int i= 1; i < size ; i++){
            rem = rem * rem ;
        }
        return rem;
    }
    public static List<Integer> getListOfAstNo(int start , int end){
        List<Integer>  list = new ArrayList<>();
        while(start < end){
            if(getAstNo(start)){
                list.add(start);
            }

            start++;
        }
        return list;
    }
}