import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
public class example_map {
    public static void main(String[] args) {
        //HashMap插入和查询性能较高，但键值对无序
        HashMap<String, Integer> map_hash = new HashMap<>();// 创建一个HashMap实例
        map_hash.put("Apple", 1); // 向HashMap中插入键值对("Apple", 1)
        map_hash.put("Banana", 2);
        System.out.println(map_hash);
        Integer value = map_hash.get("Apple"); // 获取键指定键对应的值
        map_hash.remove("Apple");  //根据键 从HashMap中移除键值对
        boolean hasKey = map_hash.containsKey("Apple"); // 检查HashMap中是否包含指定键
        boolean hasValue = map_hash.containsValue(1); // 检查HashMap中是否包含指定值
        int size = map_hash.size();  // 获取HashMap中键值对的数量
        boolean isEmpty = map_hash.isEmpty(); // 检查HashMap是否为空
        map_hash.clear(); // 清空HashMap中的所有键值对
        // 基于红黑树 根据键（key）排序
        TreeMap<String, Integer> map = new TreeMap<>(); // 创建一个TreeMap实例
        map.put("Cherry", 3); // 向TreeMap中插入键值对("Cherry", 3)
        map.put("Banana", 2);
        map.put("Apple", 1);
        // 输出顺序：Apple=1, Banana=2, Cherry=3
        for (Map.Entry<String, Integer> entry : map.entrySet()) { // 遍历TreeMap中的所有键值对
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        String firstKey = map.firstKey(); // 获取TreeMap中的第一个（最小）键
        String lastKey = map.lastKey(); // 获取TreeMap中的最后一个（最大）键

//        // 使用迭代器遍历:
//        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Integer> entry = iterator.next();
//            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//        }


    }
}
