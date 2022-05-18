package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: dingwenlong
 * @Title: 自定义异常测试
 * @ProjectName: Java基础
 * @Description:
 * @date: 2022/4/27 13:40
 */
public class 自定义异常测试 {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        try {
            age = input.nextInt();    // 获取年龄
            if(age < 0) {
                throw new 自定义异常("您输入的年龄为负数！输入有误！");
            } else if(age > 100) {
                throw new 自定义异常("您输入的年龄大于100！输入有误！");
            } else {
                System.out.println("您的年龄为："+age);
            }
        } catch(InputMismatchException e1) {
            System.out.println("输入的年龄不是数字！");
        } catch(自定义异常 e2) {
            System.out.println(e2.getMessage());
        }
    }
}
