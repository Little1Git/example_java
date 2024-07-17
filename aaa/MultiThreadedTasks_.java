package aaa;

import java.util.ArrayList;
import java.util.HashMap;

public class MultiThreadedTasks_ {
    public static void main(String[] args) {
//task1
        ArrayList<String> list_1 = new ArrayList<>();
        for (int i = 0; i < 50000000; i++)  list_1.add("Element " + i);
        HashMap<String, Integer> map_1 = new HashMap<>();
        for (String obj : list_1) {
            if (!map_1.containsKey(obj)) {
                map_1.put(obj, 0);
            }
            map_1.put(obj, map_1.get(obj) + 1);
        }
//task2
        ArrayList<String> list_2 = new ArrayList<>();
        for (int i = 0; i < 50000000; i++)  list_2.add("Element " + i);
        HashMap<String, Integer> map_2 = new HashMap<>();
        for (String obj : list_2) {
            if (!map_2.containsKey(obj)) {
                map_2.put(obj, 0);
            }
            map_2.put(obj, map_2.get(obj) + 1);
        }

    }
}
