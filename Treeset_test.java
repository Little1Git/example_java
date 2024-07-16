import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Treeset_test {
    public static void main(String[] args) {
        // 创建TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();

        // 向TreeSet插入10,000个随机数
        for (int i = 0; i < 10000; i++) {
            treeSet.add(random.nextInt(100000)); // 假设随机数范围在0到99999之间
        }

        // 使用迭代器遍历TreeSet并输出元素
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
