package test;

import inheritance.Employee;
import inheritance.Manager;
import inheritance.Person;

import java.util.Arrays;

/**
 * @Author:
 * @author: 谭海军
 * @date: 2023/5/8 13:52
 */
public class ManagerTest {
    public static void main(String[] args) {
        // 创建一个经理
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 10, 1);
        // 设置奖金
        boss.setBonus(5000);

        // 包含多个员工的数组
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("Harry Hacker", 50000, 1989, 12, 15);
        employees[1] = new Employee("Tony Tester", 40000, 1990, 3, 15);
        employees[2] = new Employee("Hermione Tester", 40000, 1990, 4, 15);
        employees[3] = boss;
        // 循环打印工资
        for (Employee e : employees) {
            // 子类一定可以代替父类使用 声明的是Employee类，但是其子类Manager也能被引用
            // 多态&动态绑定
            System.out.println(e.getName() + "" + e.getSalary());
        }

        /**
         * 继承关系/is-a规则
         * 替换原则：出现父类的任何地方都能被子类代替
         */
        // 子类对象赋值给父类变量
        Employee e;
        e = new Employee("Harry Hacker", 50000, 1989, 12, 15);
        e = new Manager("Num Manager", 20000, 1989, 10, 10);
        // 不能使用声明的类的方法/属性
        // e.setBonus(5000); error

        // 也不能将父类对象赋值给子类变量
        Manager a;
        // a = new Employee("Harry Hacker", 50000, 1989, 12, 15); error

        // 子类数组可以直接转为父类数组
        Manager[] managers = new Manager[3];
        Employee[] employees2 = managers;

        // 但是引用的是同一个数组 会导致父类变量赋值给子类的情况
        // 会导致一个ArrayStoreException错误 数组储存元素的类型不兼容
//        employees2[0] = new Employee("Harry Hacker", 50000, 1989, 12, 15);

        /**
         * 方法调用解析过程
         * 获取对应类及其父类的方法表
         * 从下往上查找对应签名的方法
         * 找到这个方法并调用
         */

        //  强制类型转换 父类引用赋值给子类时会报ClassCastException错误
        Employee e1 = new Employee("Harry Hacker", 50000, 1989, 12, 15);
//        Manager m1 = (Manager) e1;
        // 强转之前需要进行类型检查 使用instanceof
        Employee em1 = new Manager();
        Employee em2 = new Employee();
        Employee[] ems = new Employee[2];
        ems[0] = em1;
        ems[1] = em2;
        for (int i = 0; i < ems.length; i++) {
            // instanceof 不会报空指针异常， null总会返回false
            if (ems[i] instanceof Manager) {
                Manager m = (Manager) ems[i];
                System.out.println(i); // 0
            }
        }
    }
}
