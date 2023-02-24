import java.time.Year;
import java.util.stream.IntStream;

public class LambdaExercise {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();
        IntStream.rangeClosed(1960, currentYear)
            .filter(year -> (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            .forEach(year -> System.out.println(year));
    }
}


class Employee implements Comparable<Employee> {

    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +"name='" + name + '\'' +", age=" + age +", salary=" + salary +'}';
    }

    // compareTo method for comparing employees by name
    @Override
    public int compareTo(Employee otherEmployee) {
        return this.name.compareTo(otherEmployee.getName());
    }
}
