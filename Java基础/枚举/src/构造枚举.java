/**
 * @author: dingwenlong
 * @Title: 构造枚举
 * @ProjectName: Java基础
 * @Description:
 * @date: 2022/5/18 17:24
 */
public enum 构造枚举 {

    // 从构造器初始化元素。
    // 元素是 final, static
    MONDAY(1,"星期一"),TUESDAY(2,"星期二");
    
    private int code;
    private String name;

    // Enum内部使用的构造函数构造函数的修饰符是 private
    // 如果没有声明 private，java总是默认为 private。
    private  构造枚举(int code ,String name){
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    //根据code获取枚举类型
    public 构造枚举 getEnum(int code){
        for(构造枚举 i : 构造枚举.values()){
            if(i.getCode() == code)
                return i;
        }
        return null;
    }

    //根据code 获取name
    public String getName(int code) {
        for (构造枚举 i : 构造枚举.values()) {
            if (i.getCode() == code)
                return i.getName();
        }
        return null;
    }

}
