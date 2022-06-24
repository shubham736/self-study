package program.interview;

import program.interview.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryGreaterThan1000 {

    public static void main(String[] args) {
        Employee employee = new Employee("Shubham", 3000);
        Employee employee1 = new Employee("Rahul", 1000);
        Employee employee2 = new Employee("Ravi", 4000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);

        List<String> strings = employeeList.stream().filter(e -> e.getSalary() > 1000).map(Employee::getName).collect(Collectors.toList());
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
