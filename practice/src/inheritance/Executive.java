package inheritance;

/**
 * @Author: final类无法继承 方法自动变成final方法 字段不会
 * @author: 谭海军
 * @date: 2023/5/17 15:31
 */
public final class Executive extends Manager{
    public Executive(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

//    @Override
//    public String getName() {
//        return "Executive";
//    }
//    'getName()' cannot override 'getName()' in 'inheritance.Employee'; overridden method is final
}
