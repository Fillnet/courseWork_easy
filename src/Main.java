public class Main {
    private static final Employee[] employess = new Employee[10];

    public static void main(String[] args) {
        employess[0] = new Employee("Ivan Ivanov Ivanovich");
        employess[1] = new Employee("Petryxa Petrov Valerievich");
        employess[2] = new Employee("Bob Dylan Grammy");
        employess[3] = new Employee("Kurt Cobain Donald");
        employess[4] = new Employee("Valerii Meladze Marmeladze");
        System.out.println(employess[0]);
        System.out.println(employess[1]);
        System.out.println(employess[2]);
        System.out.println(employess[3]);
        System.out.println(employess[4]);
        int[] sal = Employee.generateRandomArray(10);
        System.out.println(" Сумма зарплат всех сотрудников равна: " + Employee.sumArray(sal));
        System.out.println(" Средняя зарплата сотрудников равна: " + Employee.calculateAverage(sal));
        System.out.println(" Максимальная зарплата у сотрудника: " + getMaxSalary());
        System.out.println(" Минимальная зарплата у сотрудника: " + getMinSalary());

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









}

