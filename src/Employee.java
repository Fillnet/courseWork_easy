import java.util.Random;

public class Employee {

    private String fullname;
    private int salary;
    private final int id;
    private static int count = 0;


    public Employee(String fullname, int salary) {
        this.fullname = fullname;
        this.salary = salary;
        this.id = ++count;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int salary) {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "." + fullname + " = " + salary;
    }

    public String employess() {
        return fullname;
    }


}
