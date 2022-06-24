package com.amzon.test;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidDiscountCoupon extends Application {


    /*
    * There are 3 rules for a valid string:

An empty string is valid
You can add same character to a valid string X, and create another valid string yXy
You can concatenate two valid strings X and Y, so XY will also be valid.
Ex: vv, xbbx, bbccdd, xyffyxdd are all valid.
    *
    * */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        String s="daabbd";
        if(isValid(s)){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
    public static  boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char [] arr = s.toCharArray();
        for (char c : arr) {
            if(stack.isEmpty() || c!=stack.peekFirst()) {
                stack.push(c);
            }else if(c==stack.peekFirst()) {
                stack.pop();
            }
        }

        return stack.isEmpty();

    }
}
