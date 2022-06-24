package com.java8;

import java.util.ArrayList;

public class Stream {
    private static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User("ajay", "agra", 25000));
        users.add(new User("vijay", "agra", 26000));
        users.add(new User("ram", "kanpur", 25500));
        users.add(new User("karan", "kanpur", 29000));
        users.add(new User("akshay", "lucknow", 35000));
        users.add(new User("rohit", "agra", 25110));
        users.add(new User("bharat", "lucknow", 33000));
        users.add(new User("kishore", "lucknow", 19000));
    }

    public static void main(String[] args) {
        //users.stream().map(User:get)
        // Given the above employee list, print the max-salary of each employee using java-8


        // Given the above employee list, sort the list by empployee name using java-8


        // Given this string "india is my country", find the count of character 'i' using java - 8
        // Given a number, 234127, find the sum of digits, product of its digits, and check if it is prime or not using java 8

        // Given this string "india is my country", find the count of character 'i' using java - 8
    }
}
