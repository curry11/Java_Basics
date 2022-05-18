/**
 * @author: dingwenlong
 * @Title: 构造test
 * @ProjectName: Java基础
 * @Description:
 * @date: 2022/5/18 17:37
 */
public class 构造test {
    public static void main(String[] args) {
        构造枚举 g = 构造枚举.MONDAY;

        System.out.println(g.getCode());
        System.out.println(g.getName());

        int code = 1;
        System.out.println(g.getName(code));
        System.out.println(g.getEnum(code));

        g.setCode(3);
        g.setName("星期三");
        System.out.println(g.getCode());
        System.out.println(g.getName(g.getCode()));
    }
}
