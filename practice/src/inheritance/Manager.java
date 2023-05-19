package inheritance;

/**
 * @Author: 定义继承子类
 * @author: 谭海军
 * @date: 2023/5/6 17:10
 */
public class Manager extends Employee {
    // 添加奖金字段
    private double bonus;

    public Manager() {
        super();
    }

    public Manager(String name, double salary, int year, int month, int day) {
        // 子类构造器的第一句必须是调用父类构造器
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
