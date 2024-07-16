public class example_loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { System.out.println("i = " + i);}//for循环
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) { System.out.println(number);}//增强for循环
        int i = 3;
        while (i > 0) { i--;}//while循环
        do { i++; } while (i < 5);//do-while循环
        int value = 0;
        try { // 捕获异常  无论是否发生异常 finally一定会执行
            if (value < 0) {
                throw new ArithmeticException("值不能为负数"); // 抛出异常
            } else if (value == 0) {
                throw new ArithmeticException("值不能为零");
            } else {
                throw new Exception("一般异常");
            }
        } catch (ArithmeticException e) {  // 判断异常类型
            System.out.println("捕获到算术异常: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("捕获到一般异常: " + e.getMessage());
        } finally {
            System.out.println("执行 finally 块，无论是否发生异常都会执行");
        }
    }
}
