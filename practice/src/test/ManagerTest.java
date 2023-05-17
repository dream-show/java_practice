package test;

import inheritance.Employee;
import inheritance.Manager;

import java.util.Arrays;

/**
 * @Author:
 * @author: 谭海军
 * @date: 2023/5/8 13:52
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 10, 1);
//        boss.setBonus(5000);
//        Employee[] employees = new Employee[4];
//        employees[0] = new Employee("Harry Hacker", 50000, 1989, 12, 15);
//        employees[1] = new Employee("Tony Tester", 40000, 1990, 3, 15);
//        employees[2] = new Employee("Hermione Tester", 40000, 1990, 4, 15);
//        employees[3] = boss;
//        for (Employee e : employees) {
//            System.out.println(e.getName() + "" + e.getSalary());
//        }
//        int[] arr = {2, 4, 8, 16};
//        System.out.println(arr.hashCode());
//        System.out.println(arr.toString());
//        System.out.println(Arrays.hashCode(arr));
//        System.out.println(Arrays.toString(arr));
        System.out.println(boss.getClass());
    }
}
