import java.util.Arrays;
public class example_array {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1}; // 初始化
        Arrays.sort(array);  // 数组升序排序
        int[] newArray = new int[5];  // 初始化
        // 使用 System.arraycopy 拷贝数组
        System.arraycopy(array, 0, newArray, 0, array.length);
        //(源数组, 开始复制位置, 目标数组, 开始接收位置, 复制的元素数量)

        // 使用 Arrays.copyOf 拷贝数组
        int[] newArray2 = Arrays.copyOf(array, array.length);

        for (int i = 0; i < newArray.length; i++) {  // 使用传统的 for 循环
            System.out.println(newArray[i]);
        }
        for (int num : newArray2) {     // 使用增强 for 循环
            System.out.println(num);
        }
        Integer a = array[0];// 自动装箱 包装类
        array[0] = a;// 自动拆箱 包装类
    }
}
