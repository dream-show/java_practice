package test;

import inheritance.Employee;
import inheritance.Person;
import inheritance.Student;

/**
 * @Author:
 * @author: 谭海军
 * @date: 2023/5/17 16:25
 */
public class StudentTest {
    public static void main(String[] args) {
        // 抽象类只能被声明不能实例化
        Person p1 = new Employee();
//        Person p2 = new Person(); error

        Person[] persons = new Person[2];
        persons[0] = new Student("张三", "CS");
        persons[1] = new Employee("李四", 1000, 2000, 01, 01);
        for (Person person : persons) {
            System.out.println(person.getName() + " is " + person.getDescription());
        }





  }
}
