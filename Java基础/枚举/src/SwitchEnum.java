/**
 * @author: dingwenlong
 * @Title: SwitchEnum
 * @ProjectName: Java基础
 * @Description:
 * @date: 2022/5/18 16:59
 */
public class SwitchEnum {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.FRIDAY;

        switch (weekDay){
            case FRIDAY:
                System.out.println("1");
                break;
            case MONDAY:
                System.out.println("2");
                break;
            case SUNDAY:
                System.out.println("3");
        }
    }
}
