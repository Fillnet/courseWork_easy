public class Main {
    private static final Employee[] employess = new Employee[10];

    public static void main(String[] args) {
        employess[0] = new Employee("Ivan Ivanov Ivanovich", 100000);
        employess[1] = new Employee("Petryxa Petrov Valerievich", 150000);
        employess[2] = new Employee("Bob Dylan Grammy", 160000);
        employess[3] = new Employee("Kurt Cobain Donald", 125000);
        employess[4] = new Employee("Valerii Meladze Marmeladze", 115000);
        System.out.println(employess[0]);
        System.out.println(employess[1]);
        System.out.println(employess[2]);
        System.out.println(employess[3]);
        System.out.println(employess[4]);
        System.out.println(" Сумма зарплат всех сотрудников равна: " + summarySalary());
        System.out.println(" Максимальная зарплата у сотрудника: " + getMaxSalary());
        System.out.println(" Минимальная зарплата у сотрудника: " + getMinSalary());
//        System.out.println(getAverageValueSalary());
    }

    public static int summarySalary() {
        int sum = 0;
        for (Employee employee : employess) {
            if (employee != null)
                sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee getMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee workMaxEmployee = null;
        for (Employee employee : employess) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                workMaxEmployee = employee;
            }
        }
        return workMaxEmployee;
    }

    public static Employee getMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee workMinEmployee = null;
        for (Employee employee : employess) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                workMinEmployee = employee;
            }
        }
            return workMinEmployee;
    }

    public static int getAverageValueSalary() {
        int averageValueSalary = getAverageValueSalary();
        return averageValueSalary / employess.length;
    }

}