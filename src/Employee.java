import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class Employee {

    private String fullname;
    private int salary;
    private final int id;
    private static int count = 0;
    static int[] sal = generateRandomArray(10);
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(( 100000)) + 100000;
        }
        return array;
    }
    public static int calculateAverage(int[] array) {
        int sum = sumArray(array);
        return sum / array.length;
    }

    public static int sumArray(int[] array) {
            return Arrays.stream(array).sum();
        }

    public static OptionalInt getMaxSalary(int[] array) {
         return Arrays.stream(sal).max();
    }


    public Employee(String fullname) {
        this.fullname = fullname;
        this.salary = salary;
        this.id = ++count;
        this.sal[id] = sal[count];
    }

    public static int getSalary() {
        return sal[count];
    }

    public int setSalary(int sal[]) {
        return sal[count];
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "." + fullname + " =  "  + sal[id];
    }

    public String employess() {
        return fullname;
    }


}

