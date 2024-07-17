package aaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ForkJoinPool;
import java.util.function.BiFunction;

public class MultiThreadedExample {
    public static void main(String[] args) {
        // 使用线程安全的集合类
        List<String> istock_List = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 50000000; i++) {
            istock_List.add("Element " + i);
        }

        // 使用线程安全的 ConcurrentMap
        ConcurrentMap<String, Integer> iStockSumm = new ConcurrentHashMap<>();

        long startTimeLink = System.nanoTime();

//        // 使用 parallelStream 进行并行处理
//        istock_List.parallelStream().forEach(obj -> {
//            iStockSumm.merge(obj, 1, Integer::sum);//引用了 Integer 类中的静态方法 sum
//        });

        // 指定要使用的线程数
        int parallelism = 4; // 例如，使用 4 个线程
        //1  26107899  113402600  988094100  3387388699  4527103201
        //2            100083899             2317300300  3025227600
        //4  31355400   85024399  559674900  2027818700  2192795200
        //                                               2852211800


        ForkJoinPool customThreadPool = new ForkJoinPool(parallelism);
        try {
            customThreadPool.submit(() -> {
                istock_List.parallelStream().forEach(obj -> {
                    iStockSumm.merge(obj, 1, Integer::sum);
                });
            }).get();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            customThreadPool.shutdown();
        }

        long endTimeLink = System.nanoTime();
        long durationLink = endTimeLink - startTimeLink;
        System.out.println(durationLink );

//        merge 方法有三个参数：
//        第一个参数 obj 是要合并的键（在这里是字符串）。
//        第二个参数 1 是要与键关联的值（在这里是整数 1，表示初始值）。
//        第三个参数 Integer::sum 是一个 BiFunction 接口的实现，用于在键已存在时将两个值合并。

//        如果 obj 作为键在 iStockSumm 中不存在，merge 方法将 obj 作为新键，并将 1 作为它的值插入到 iStockSumm 中。
//        如果 obj 作为键在 iStockSumm 中已存在，merge 方法将当前的值（即 iStockSumm 中该键对应的值）与 1 进行合并。合并的方式是通过 Integer::sum，即相加操作。


    }
}
