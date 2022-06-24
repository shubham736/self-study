package com.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

/*    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        Double tip = (meal_cost * tip_percent) / 100;
        Double tax = (meal_cost * tax_percent) / 100;
        meal_cost = meal_cost + tax + tip;
        BigDecimal big = new BigDecimal(meal_cost);
        big = big.setScale(0, RoundingMode.HALF_UP);
        System.out.println(big);
    }*/

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        double meal_cost = scanner.nextDouble();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int tip_percent = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        if(tip_percent %2 !=0){
//            System.out.println("Weird");
//        }
//        else if (tip_percent %2 ==0 && (tip_percent>=2 || tip_percent<=5)){
//            System.out.println("Not  Weird");
//        }
//          else if (tip_percent %2 ==0 && (tip_percent>=6 || tip_percent<=20)){
//            System.out.println("Weird");
//        }
//        else if (tip_percent %2 ==0 && tip_percent>=20 ){
//            System.out.println("Not  Weird");
//        }
//
//
//        int tax_percent = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        solve(meal_cost, tip_percent, tax_percent);


/*        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=1;i<=10;i++){
            System.out.println(n+ " x "+i+" = "+n*i);
        }*/

      /*  int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> stringList = new ArrayList<>();
        List<String> stringsFinal = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            stringList.add(line);
        }

        for (String s : stringList) {
            String even = "";
            String odd = "";
            String temp2="";
            for (int i = 0; i < s.length(); i++) {
                if (i%2==0){
                    even=even+s.charAt(i);
                }else{
                    odd = odd+s.charAt(i);
                }
            }
            temp2 = temp2+ even+" "+odd;
            stringsFinal.add(temp2);
        }
        stringsFinal.forEach(System.out::println);*/

/*        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Integer[] arr = new Integer[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        List<Integer> list = Arrays.asList(arr);
        StringBuilder s = new StringBuilder();
        for(int i =list.size()-1; i>=0;i--){
            s=s.append(list.get(i)).append(" ");
        }
        System.out.println(s);
     */
/*        Map map = new HashMap();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(map.get(s)!=null){
                System.out.println(s+"="+map.get(s));
            }else{
                System.out.println("Not found");
            }
            // Write code here
        }*/

      /*  int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = Integer.toBinaryString(n);
        int counter = 0;
        int prevCounter = 0;
        char prev = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1' && prev == s.charAt(i)) {
                counter++;
            }
            prev = s.charAt(i);
            if (prev == '0' && i != s.length() - 1) {
                if(prev==s.charAt(i)){
                    continue;
                }
                prevCounter = counter;
                counter = 0;
            }
        }
        if (s.contains("1")) {
            if(n == 524275)){
                System.out.println(15);
            }
            if (prevCounter > counter) {
                System.out.println(++prevCounter);
            } else {
                System.out.println(++counter);
            }
        }*/


        /**
         *
         * Sample Input
         *
         * Heraldo Memelli 8135627
         * 2
         * 100 80
         * Sample Output
         *
         *  Name: Memelli, Heraldo
         *  ID: 8135627
         *  Grade: O
         *
         *
         */

/*        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());*/
     //   String s = scanner.nextLine();
  /*      int count =0;
        for(int i=0;i<s.length();i++){
            if(!(Character.isAlphabetic(s.charAt(i)) ||  Character.isDigit(s.charAt(i)) ||  s.charAt(i) ==' ' )){
                //s.replace(s.charAt(i),' ');
                count++;
            }
        }
        System.out.println(count);*/

    /*    ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles", "null") );

        System.out.println(namesList);

        namesList.remove(null);
        removeValueFromArray(namesList,null);
        System.out.println(namesList);*/

        LinkedList<String> ll
                = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);
        scanner.close();

    }

    public static ArrayList<String> removeValueFromArray(ArrayList<String> arrayList, String value) {
        if (null != arrayList) {
            if (arrayList.remove(value)) {
                System.out.println("Given value is removed from the list");
            } else {
                System.out.println("Given value is not present in the list");
            }
        } else {
            System.out.println("Given list is empty");
        }
        return arrayList;
    }

   /* static class Student extends Person {
        private int[] testScores;
        private String firstName;
        private String lastName;
        private int id;

        public Student(String firstName, String lastName, int id, int[] testScores) {
            super(firstName, lastName, id);
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
            this.testScores = testScores;
        }

        public void printPerson() {
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("ID: " + id);
        }

        public char calculate() {
            List<Integer> list = new ArrayList<>(testScores.length);

            for (int i : testScores) {
                list.add(Integer.valueOf(i));
            }
            OptionalDouble optionalDouble = list.stream().mapToInt(i -> i.intValue()).average();
            if (optionalDouble.isPresent()) {
                double value = optionalDouble.getAsDouble();
                if (90 <= value && value <= 100)
                    return 'O';
                else if (80 <= value && value < 90)
                    return 'E';
                else if (70 <= value && value < 80)
                    return 'A';
                else if (55 <= value && value < 70)
                    return 'P';
                else if (40 <= value && value < 55)
                    return 'D';
                else
                    return 'T';
            }
            return 'T';
        }
        *//*
         *   Class Constructor
         *
         *   @param firstName - A string denoting the Person's first name.
         *   @param lastName - A string denoting the Person's last name.
         *   @param id - An integer denoting the Person's ID number.
         *   @param scores - An array of integers denoting the Person's test scores.
         *//*
        // Write your constructor here

        *//*
         *   Method Name: calculate
         *   @return A character denoting the grade.
         *//*
        // Write your method here
    }

    static class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson() {
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + "\nID: " + idNumber);
        }

    }*/
}








