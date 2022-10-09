public class Employee {
    private String fullname;
    private String department;
    private int salary;
    private final int id;
    private static int count = 0;

    public Employee(String department ,String fullname, int salary) {
        this.fullname = fullname;
        this.salary = salary;
        this.id = ++count;
        this.department = department;
    }

    public String getFullname() {
        return fullname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + ". Отдел: "+ department + ". " + fullname + " ,зарплата =  "  + salary + " рублей";
    }
}

