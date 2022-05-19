package 枚举类工厂;

/**
 * @author: dingwenlong
 * @Title: CacheType
 * @ProjectName: Java基础
 * @Description:  缓存类型
 * @date: 2022/5/19 12:05
 */
public enum CacheType {
    LinkedHashMap {
        @Override
        public <K, V> BasicCache<K, V> create(int maximumSize) {
            return null;
        }
    };


    public abstract <K, V> BasicCache<K, V> create(int maximumSize);
}
