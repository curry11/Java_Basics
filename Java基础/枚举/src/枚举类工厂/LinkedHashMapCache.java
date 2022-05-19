package 枚举类工厂;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: dingwenlong
 * @Title: LinkedHashMapCache
 * @ProjectName: Java基础
 * @Description:  缓存实现类
 * @date: 2022/5/19 11:42
 */
// 注：没有public修饰，只在包内访问，屏蔽了可见性，对外只暴露BasicCache
final class LinkedHashMapCache<K,V> implements BasicCache<K,V>{
    private final Map<K, V> map;

    public LinkedHashMapCache(int maximumSize, boolean accessOrder) {
        map = new BoundedLinkedHashMap<>(maximumSize, accessOrder);
    }


    @Override
    public V get(K key) {
        synchronized (map) {
            return map.get(key);
        }
    }

    @Override
    public void put(K key, V value) {
        synchronized (map) {
            map.put(key, value);
        }
    }

    static final class BoundedLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        private static final long serialVersionUID = 1L;
        private final int maximumSize;

        public BoundedLinkedHashMap(int maximumSize, boolean accessOrder) {
            super(maximumSize, 0.75f, accessOrder);
            this.maximumSize = maximumSize;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > maximumSize;
        }
    }

}
