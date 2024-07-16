import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class example_set {
    public static void main(String[] args) {
        //基于哈希算法，元素存储无序，但可以通过哈希算法快速定位元素。
        HashSet<String> set_hash = new HashSet<>();// 创建一个HashSet实例
        set_hash.add("Cc");// 向HashSet中添加元素
        set_hash.add("Bb");
        set_hash.add("Aa");
        System.out.println(set_hash);// 打印HashSet中的所有元素
        for (String item : set_hash) System.out.println(item);// 增强for-each循环遍历HashSet(只读)
        Iterator<String> iterator = set_hash.iterator();// 获取HashSet的迭代器
        while (iterator.hasNext()) {  //通过迭代器遍历HashSet， 可以删除元素  不能修改元素
            System.out.println(iterator.next());
        }
        set_hash.remove("Aa");// 从HashSet中移除元素
        boolean hasBanana = set_hash.contains("Bb");// 检查HashSet中是否包含元素
        int size = set_hash.size();// 获取HashSet中元素的数量
        boolean isEmpty = set_hash.isEmpty();// 检查HashSet是否为空
        set_hash.clear();// 清空HashSet中的所有元素
        //内部使用红黑树 有序存储
        TreeSet<String> set = new TreeSet<>();// 创建一个TreeSet实例
        set.add("Cc");// 向TreeSet中添加元素
        set.add("Bb");
        set.add("Aa");
        String first = set.first();// 获取TreeSet中第一个（最小的）元素
        String last = set.last();// 获取TreeSet中最后一个（最大的）元素
        Iterator<String> iterator2 = set.iterator();// 获取TreeSet的迭代器
        while (iterator2.hasNext()) { System.out.println(iterator2.next());}// 通过迭代器遍历TreeSet
    }
}
