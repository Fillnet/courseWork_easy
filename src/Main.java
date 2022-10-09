public class Main {
    private static final Employee[] employess = new Employee[5];
    public static void main(String[] args) {
        employess[0] = new Employee("Бухгалтерия","Ivan Ivanov Ivanovich", 125547);
        employess[1] = new Employee("ИТ","Petryxa Petrov Valerievich", 115326);
        employess[2] = new Employee("Разработка","Bob Dylan Grammy", 178147);
        employess[3] = new Employee("Тестировщики", "Kurt Cobain Donald", 136222);
        employess[4] = new Employee("Разработка","Valerii Meladze Marmeladze", 196158);
        System.out.println(employess[0]);
        System.out.println(employess[1]);
        System.out.println(employess[2]);
        System.out.println(employess[3]);
        System.out.println(employess[4]);
        System.out.println();
        System.out.println(" Сумма зарплат всех сотрудников равна: " + calculatSumSalary());
        System.out.println(" Средняя зарплата сотрудников равна: " + getAverageSalary());
        System.out.println(" Максимальная зарплата у сотрудника: " + getMaxSalary());
        System.out.println(" Минимальная зарплата у сотрудника: " + getMinSalary());
        System.out.println();
        System.out.println("Список сотрудников: ");
        System.out.println(employess[0].getFullname());
        System.out.println(employess[1].getFullname());
        System.out.println(employess[2].getFullname());
        System.out.println(employess[3].getFullname());
        System.out.println(employess[4].getFullname());
//        employess[0].setSalary(555555);
//        employess[0].setDepartment("Тестировщик");
//        System.out.println(" Сумма зарплат всех сотрудников равна: " + calculatSumSalary());
//        System.out.println(" Максимальная зарплата у сотрудника: " + getMaxSalary());
//        System.out.println(employess[0]);
    }
    public static int calculatSumSalary() {
        int sum = 0;
        for (Employee employee : employess) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static int getAverageSalary() {
        int average = 0;
        for (Employee employee : employess) {
            if (employee != null) {
                average += employee.getSalary();
            }
        }
            return average/employess.length;
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

