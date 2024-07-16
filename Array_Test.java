import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Array_Test {
    public static void main(String[] args) {
        // 创建ArrayList和LinkedList
        ArrayList<Integer> list_Array = new ArrayList<>();
        LinkedList<Integer> list_Link = new LinkedList<>();

        // 在ArrayList的中间插入10,000个元素并记录时间
        long startTimeArray = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list_Array.add(list_Array.size() / 2, i);
        }
        long endTimeArray = System.nanoTime();
        long durationArray = endTimeArray - startTimeArray;
        System.out.println("ArrayList中间插入10,000个元素的时间: " + durationArray + " 纳秒");

        // 在LinkedList的中间插入10,000个元素并记录时间
        long startTimeLink = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list_Link.add(list_Link.size() / 2, i);
        }
        long endTimeLink = System.nanoTime();
        long durationLink = endTimeLink - startTimeLink;
        System.out.println("LinkedList中间插入10,000个元素的时间: " + durationLink + " 纳秒");

        // 在ArrayList的[0]插入10,000个元素并记录时间
        long startTimeArray2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list_Array.add(0, i);
        }
        long endTimeArray2 = System.nanoTime();
        long durationArray2 = endTimeArray2 - startTimeArray2;
        System.out.println("ArrayList头部插入10,000个元素的时间: " + durationArray2 + " 纳秒");

        // 在LinkedList的[0]插入10,000个元素并记录时间
        long startTimeLink2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list_Link.add(0, i);
        }
        long endTimeLink2 = System.nanoTime();
        long durationLink2 = endTimeLink2 - startTimeLink2;
        System.out.println("LinkedList头部插入10,000个元素的时间: " + durationLink2 + " 纳秒");
    }
//    ArrayList中间插入10,000个元素的时间: 179767300 纳秒
//    LinkedList中间插入10,000个元素的时间: 3707356800 纳秒
//    ArrayList头部插入10,000个元素的时间: 928975800 纳秒
//    LinkedList头部插入10,000个元素的时间: 3976500 纳秒

//        LinkedList的底层使用了双向链表
//        LinkedList不支持随机访问
//        LinkedList的头部位置插入和删除元素时效率比较高，时间复杂度为O(1)
//        LinkedList比较适合头部位置插入的场景

}
