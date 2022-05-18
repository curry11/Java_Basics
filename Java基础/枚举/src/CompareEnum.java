/**
 * @author: dingwenlong
 * @Title: CompareEnum
 * @ProjectName: Java基础
 * @Description:
 * @date: 2022/5/18 16:53
 */
public class CompareEnum {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.MONDAY;
        if(weekDay == WeekDay.FRIDAY){
            System.out.println("工作");
        }else {
            System.out.println(WeekDay.MONDAY);
        }
    }
}
