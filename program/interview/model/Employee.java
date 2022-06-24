package program.interview.model;

public class Employee implements Cloneable {

    private String name;
    private int salary;
    private Customer customer;

    public Employee() {

    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public  Object clone() throws CloneNotSupportedException {
        this.name = name;
        this.salary = salary;
        return super.clone();
    }

    public  Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public  static  String  java8Check(){
        return "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", customer=" + customer +
                '}';
    }
}
