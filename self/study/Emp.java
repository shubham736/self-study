package self.study;

import program.interview.model.Employee;

import java.util.HashMap;

public class Emp {

    private  String name;
    private int salary;

    public Emp(){

    }
    public Emp(String name, int salary){
    this.name = name;
    this.salary= salary;
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
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Emp)) {
            return false;
        }

        Emp user = (Emp) o;

        return user.name.equals(name) &&
                user.salary == salary;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + salary;
        return result;
    }
}
