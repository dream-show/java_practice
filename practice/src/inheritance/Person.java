package inheritance;

/**
 * @Author: 抽象类
 * @author: 谭海军
 * @date: 2023/5/17 16:06
 */
public abstract class Person {
    private String name;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    // 抽象方法必须被重写，除非子类也是抽象类
    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
