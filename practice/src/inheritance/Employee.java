package inheritance;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author:
 * @author: 谭海军
 * @date: 2023/5/6 17:10
 */
public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee() {
        super();
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

//    // final方法无法被覆盖
//    public final String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }

        if (otherObject == null) {
            return false;
        }

        if (getClass() != otherObject.getClass()) {
            return false;
        }

        Employee other = (Employee) otherObject;
        return Objects.equals(super.getName(), other.getName())
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode() {
        return Objects.hash(super.getName(), salary, hireDay);
    }

    public String toString() {
        return getClass().getName();
    }

}