public class example_string {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + ", " + str2 + "!"; // 使用 + 拼接
        String result2 = str1.concat(", ").concat(str2).concat("!");// 使用方法拼接

        boolean isEqual = result.equals(result2);  //true 判断相等(根据值判断)
        isEqual = (result == result2);  //false  对象的引用（内存地址）


        int length = result.length();  // 获取字符串长度

        String[] subStr = result.split(",");   // 用指定符号分割字符串

        String name = "Alice";
        int age = 30;
        String formatStr = String.format("Name: %s, Age: %d", name, age); //创建格式化的字符串
        //占位符: %s - 字符串  %d - 整数  %f - 浮点数  %t - 日期/时间  %% - 百分号

        int index = result.indexOf("World");  // 查找子串开始位置
    }
}
