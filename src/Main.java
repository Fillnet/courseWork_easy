
public class Main {
    private static final Employee[] employess = new Employee[10];
    public static void main(String[] args) {
        employess[0] = new Employee("Бухгалтерия","Иванов Иван Иванович", 125547);
        employess[1] = new Employee("ИТ","Петров Петруха Валерьевич", 115326);
        employess[2] = new Employee("Разработка","Боб Дилан", 178147);
        employess[3] = new Employee("Тестировщики", "Курт Дональд Кобейн", 136222);
        employess[4] = new Employee("Разработка","Меладзе Валерий", 196158);
        employess[5] = new Employee("Разработка", "Тестовый", 199999);
        fullEmployee();
        System.out.println();
        System.out.println(" Сумма зарплат всех сотрудников равна: " + calculatSumSalary());
        System.out.println(" Средняя зарплата сотрудников равна: " + getAverageSalary());
        System.out.println(" Максимальная зарплата у сотрудника: " + getMaxSalary());
        System.out.println(" Минимальная зарплата у сотрудника: " + getMinSalary());
        System.out.println();
        System.out.println("Список сотрудников: ");
        fullName();
        }
//        employess[0].setSalary(555555);
//        employess[0].setDepartment("Тестировщик");
//        System.out.println(" Сумма зарплат всех сотрудников равна: " + calculatSumSalary());
//        System.out.println(" Максимальная зарплата у сотрудника: " + getMaxSalary());
//        System.out.println(employess[0]);
    private static void fullName() {
            for(Employee var : employess){
            if (var != null) {
            System.out.println(var.getFullname());
            }
        }
    }
    private static void fullEmployee() {
        for(Employee var : employess){
            if (var != null) {
                System.out.println(var);
            }
        }

    }
    private static int calculatSumSalary() {
        int sum = 0;
        for (Employee employee : employess) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    private static int getAverageSalary() {
        int average = 0;
        int total = 0;
        for (Employee employee : employess) {
            if (employee != null) {
                average += employee.getSalary();
            }
        }
            for (Employee employee : employess) {
                if (employee != null) {
                    total++;
                }
            }
            return average/total;
        }
    private static Employee getMinSalary() {
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
        private static Employee getMaxSalary() {
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


