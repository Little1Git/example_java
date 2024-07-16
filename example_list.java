import java.util.ArrayList;
import java.util.LinkedList;
public class example_list {
    public static void main(String[] args) {
        ArrayList<Character> list_array3 = new ArrayList<>();
        ArrayList<Integer> list_array2 = new ArrayList<>();
        //ArrayList基于动态数组  可自动调整数组大小  可按索引访问
        ArrayList<String> list_array = new ArrayList<>();//初始化
        list_array.add("Apple");  //尾部添加元素
        list_array.add(0, "Banana");//在指定位置插入元素 之后的所有元素将向后移动
        System.out.println(list_array);  //可直接输出
        String s = list_array.get(0);// 根据索引获取指定元素
        list_array.set(1, "Cherry"); // 根据索引替换元素
        list_array.remove(1);  // 根据索引移除指定元素(必须存在)
        list_array.remove("Cherry");  // 根据值 移除元素(可不存在)
        boolean apple = list_array.contains("Apple");// 检测元素是否存在
        int size = list_array.size();//获取list元素个数
        boolean empty = list_array.isEmpty();//检测list是否为空
        for (String sub : list_array) { System.out.println(sub);}//增强for循环遍历list
        list_array.clear();//清空list
        //LinkedList基于双向链表实现  需要从头或尾开始遍历
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Cherry");  //首位添加元素
        list.addLast("Date");
        String first = list.getFirst();  //首尾获取元素
        String last = list.getLast();
        String removedFirst = list.removeFirst(); //删除的同时返回元素
        String removedLast = list.removeLast();
    }
}
