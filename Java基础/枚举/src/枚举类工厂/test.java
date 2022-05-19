package 枚举类工厂;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: dingwenlong
 * @Title: test
 * @ProjectName: Java基础
 * @Description:
 * @date: 2022/5/19 12:06
 */
public class test {
    public static void main(String[] args) {

        // 使用枚举，可充当工厂类作用
        BasicCache<String, String> enumLinkedHash = CacheType.LinkedHashMap.create(2);
        enumLinkedHash.put("1","2");
        System.out.println(enumLinkedHash.get("1"));

        // 直接实例化
        //BasicCache<String,String> stringBasicCache

    }
}
