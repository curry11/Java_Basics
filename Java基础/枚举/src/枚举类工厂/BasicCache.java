package 枚举类工厂;

/**
 * @author: dingwenlong
 * @Title: BasicCache
 * @ProjectName: Java基础
 * @Description: 缓存接口 枚举充当工厂类的用法
 * @date: 2022/5/19 11:30
 */
public interface BasicCache<K,V> {
    V get(K key);

    void put(K key,V value);
}
