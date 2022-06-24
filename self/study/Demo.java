package self.study;

import com.utlity.Print;
import program.interview.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        // List<Integer> list = Arrays.asList(4, 5, 1, 12, 89, 45);
/*        List<Integer> list = Arrays.asList(1,2,3);
        // Customer sorting
        list.sort((e1,e2) -> e1 - e2);
        list.forEach(System.out::println);*/

// fetch 2nd largest
/*        list.stream().sorted();
        list.forEach(System.out::println);
        System.out.println("=======");
        System.out.println(list.get(list.size()-1));*/
//Min value
/*        Optional min  = list.stream().min((a, b) -> a-b);
        if(min.isPresent())
            System.out.println(min.get());*/

//Max value
/*        Optional max  = list.stream().max((a, b) -> a-b);
        if(max.isPresent())
            System.out.println(max.get());*/
        List list1 = Arrays.asList("shubham", "gupta", "ravi", "rahul");
/*// shubham , gupta , ravi , rahul
        List list1 = Arrays.asList("shubham" ,"gupta","ravi", "rahul");
        Optional optional = list1.stream().reduce((a,b) -> a+ " , "+b);
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
// alernative way
        String  s = String.join(" | " ,list1);
        System.out.println(s);*/
        // average
/*    OptionalDouble optional = list.stream().mapToInt(e->e).average();
    if(optional.isPresent())
        System.out.println(optional.getAsDouble());

        IntStream stream = IntStream.of(2, 3, 4, 5, 6, 7, 8);

        // OptionalDouble is a container object
        // which may or may not contain a
        // doouble value.
        OptionalDouble obj = stream.average();
        if (obj.isPresent()) {
            System.out.println(obj.getAsDouble());
        }*/


        List<Employee> list2 = new ArrayList<>();
        list2.add(new Employee("liquidweb.com", 7));
        list2.add(new Employee("linode.com", 2));
        list2.add(new Employee("digitalocean.com", 1));
        list2.add(new Employee("aws.amazon.com", 19));
        list2.add(new Employee("mkyong.com", 6));


/*        int[] ints = {3, 2, 2, 3, 4, 3, 5, 6, 5, 7};

        OptionalInt anInt =  Arrays.stream(ints).max();
        if(anInt.isPresent()){
            System.out.println(anInt.getAsInt());
        }*/

        System.out.println(solution(null));


        // If you what to modify current list
/*        list2.sort(Comparator.comparingInt(Employee::getSalary));
       // System.out.println("Result 1 : " + list2);*/

        // If you do not what to modify current list
/*        List<Employee> list4=  list2.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
        System.out.println("Result 1 : " + list4);*/
// Consversion of list to map
/*

        Map<String, Integer> map =  list2.stream().
                collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println("Result 1 : " + list2);*/

        // how to call static method in java8 , cant use method references
/*
        list2.stream().map(employee -> employee.java8Check()).collect(Collectors.toList()).forEach(System.out::println);
*/
       // removeDuplicate();
    }


    public static void removeDuplicate() {
        int[] ints = {3, 2, 2, 3, 4, 3, 5, 6, 5, 7};
        // int j= ints[0];
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] != -1 && ints[i] == ints[i + 1]) {
                ints[i + 1] = -1;
            }
        }
        Print.printArray(ints);
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        A= new int[]{1, 3, 6, 4, 1, 2};
        int size = A.length;


        int max =0;
        int min =0;
        List<Integer> list = new ArrayList<>();
        for(Integer integer : A){
            list.add(integer);
        }
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        int result = (size *(size+1))/2;
        if(sum == result)
            return ++size;
        Optional anInt =  list.stream().max(Comparator.comparingInt(a -> a));
        if(anInt.isPresent()){
            max= (int) anInt.get();
        }
        Optional anIntInt =  list.stream().min((a, b) -> a-b);
        if(anIntInt.isPresent()){
            min= (int) anIntInt.get();
        }

        for (int i = min ; i < max ; i++){
            if(list.contains(i))
                continue;
            else
                return i;
        }
        return 0;
    }
}
