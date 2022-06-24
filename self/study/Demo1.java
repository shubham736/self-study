package self.study;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        Emp emp = new Emp("shubham", 1000);
        Emp emp1 = new Emp("rahul", 800);
        Emp emp2 = new Emp("ravi", 2000);
        List<Emp> empList = new ArrayList<>();
        empList.add(emp);
        empList.add(emp1);
        empList.add(emp2);

        List<String>  strings= empList.stream().filter(e ->e.getSalary() >1000).map(Emp::getName).collect(Collectors.toList());
        strings.forEach(System.out::println);
    }
}



