package try_catch;

import java.util.Scanner;

/**
 * @author: dingwenlong
 * @Title: try_catch_finally
 * @ProjectName: Java基础
 * @Description:
 * @date: 2022/4/27 12:16
 */
public class try_catch_finally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Windows 系统已启动！");
        String[] pros = { "记事本", "计算器", "浏览器" };
        try {
            // 循环输出pros数组中的元素
            for (int i = 0; i < pros.length; i++) {
                System.out.println(i + 1 + "：" + pros[i]);
            }
            System.out.println("是否运行程序：");
            String answer = input.next();
            if (answer.equals("y")) {
                System.out.println("请输入程序编号：");
                int no = input.nextInt();
                System.out.println("正在运行程序[" + pros[no - 1] + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("谢谢使用!");
        }
    }
}
