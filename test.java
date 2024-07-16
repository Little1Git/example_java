import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Short num = 10;
        num = 30;
        modifyValue(num);
        System.out.println("After modifyValue: " + num);  // 输出 30

        Integer[] arr = {1, 2, 3};
        modifyArray(arr);
        System.out.println("After modifyArray: " + Arrays.toString(arr));  // 输出 [100, 2, 3]
    }

    static void modifyValue(Short value) {
        value = 20;  // 这不会改变原始对象
    }

    static void modifyArray(Integer[] array) {
        array[0] = 100;  // 这会改变数组中的元素
    }
}
