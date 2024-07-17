package aaa;

import java.util.ArrayList;
import java.util.HashMap;

public class org {
    public static void main(String[] args) {


        ArrayList<String> istock_List = new ArrayList<>();
        for (int i = 0; i < 50000000; i++)  istock_List.add("Element " + i);

        HashMap<String, Integer> iStockSumm = new HashMap<>();

        long startTimeLink = System.nanoTime();
        for (String obj : istock_List) {
            if (!iStockSumm.containsKey(obj)) {
                iStockSumm.put(obj, 0);
            }
            iStockSumm.put(obj, iStockSumm.get(obj) + 1);
        }
        long endTimeLink = System.nanoTime();
        long durationLink = endTimeLink - startTimeLink;
        System.out.println(durationLink );
        //  2852211800
    }
}
