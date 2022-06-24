package self.study;

import program.interview.model.Customer;
import program.interview.model.Employee;

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.setName("Shubham");
        employee.setSalary(10000);
        Customer customer = new Customer();
        customer.setAddress("Ballia");
        customer.setName("Abhi");
        employee.setCustomer(customer);
        System.out.println(employee.toString());
        Employee employee1 =  (Employee) employee.clone();
        System.out.println(employee1.toString());
        employee1.setName("Ravi");
        employee1.setSalary(20000);
        Customer customer1 = new Customer();
        customer1.setAddress("Arra");
        customer1.setName("Rahul");
        employee1.setCustomer(customer1);
        System.out.println(employee1.toString());
        System.out.println(employee.toString());


    }
}
