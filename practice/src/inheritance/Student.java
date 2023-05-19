package inheritance;

/**
 * @Author:
 * @author: 谭海军
 * @date: 2023/5/17 16:22
 */
public class Student extends Person {
    private String major;

    public Student(){
        super();
    }

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}