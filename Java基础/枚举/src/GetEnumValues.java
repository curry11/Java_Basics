/**
 * @author: dingwenlong
 * @Title: GetEnumValues
 * @ProjectName: Java基础
 * @Description:
 * @date: 2022/5/18 17:01
 */
public class GetEnumValues {
    public static void main(String[] args) {
        WeekDay[] weekDays = WeekDay.values();
        for (WeekDay weekDay : weekDays){
            System.out.println(weekDay);
        }
    }
}
