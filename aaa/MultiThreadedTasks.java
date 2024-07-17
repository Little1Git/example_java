package aaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadedTasks {
    public static void main(String[] args) throws InterruptedException {
        // 创建一个 ExecutorService，使用两个线程
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // 记录开始时间
        long startTime = System.nanoTime();

        // 提交第一个任务
        executorService.submit(() -> {
            // Task 1
            ArrayList<String> list_1 = new ArrayList<>();
            for (int i = 0; i < 50000000; i++) list_1.add("Element " + i);
            HashMap<String, Integer> map_1 = new HashMap<>();
            for (String obj : list_1) {
                if (!map_1.containsKey(obj)) {
                    map_1.put(obj, 0);
                }
                map_1.put(obj, map_1.get(obj) + 1);
            }
//            long endTime1 = System.nanoTime();
//            System.out.println("Task 1 completed in " + (endTime1 - startTime) / 1_000_000 + " ms");
        });

        // 提交第二个任务
        executorService.submit(() -> {
            // Task 2
            ArrayList<String> list_2 = new ArrayList<>();
            for (int i = 0; i < 50000000; i++) list_2.add("Element " + i);
            HashMap<String, Integer> map_2 = new HashMap<>();
            for (String obj : list_2) {
                if (!map_2.containsKey(obj)) {
                    map_2.put(obj, 0);
                }
                map_2.put(obj, map_2.get(obj) + 1);
            }
//            long endTime2 = System.nanoTime();
//            System.out.println("Task 2 completed in " + (endTime2 - startTime) / 1_000_000 + " ms");
        });

        // 关闭 ExecutorService
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        long endTime1 = System.nanoTime();
        System.out.println("Task  completed in " + (endTime1 - startTime) / 1_000_000 + " ms");
    }
}
