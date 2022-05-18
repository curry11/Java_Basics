package try_catch;

import java.util.Scanner;

/**
 * @author: dingwenlong
 * @Title: try_catch_demo
 * @ProjectName: Java基础
 * @Description:
 * @date: 2022/4/27 11:59
 */
public class try_catch_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------学生信息录入---------------");
        String name = ""; // 获取学生姓名
        int age = 0; // 获取学生年龄
        String sex = ""; // 获取学生性别
        try {
            System.out.println("请输入学生姓名：");
            name = scanner.next();
            System.out.println("请输入学生年龄：");
            age = scanner.nextInt();
            System.out.println("请输入学生性别：");
            sex = scanner.next();
        } catch (Exception e) {
            e.printStackTrace();   //指出异常的类型、性质、栈层次及出现在程序中的位置
            System.out.println("输入有误！");
        }
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
    }
}
