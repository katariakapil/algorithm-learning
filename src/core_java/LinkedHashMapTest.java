package core_java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    public static void main(String[] args) {

        // it maintains the order of insertion

        int capacity = 4;
        LinkedHashMap<Integer, String> map = new LinkedHashMap(4) {

            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return this.size() > capacity; // when we reach the size greater than capacity remove element from map
            }
        };

        map.put(11, "ONE");
        map.put(32, "TWO");
        map.put(53, "THREE");
        map.put(54, "FOUR");
        map.put(15, "FIVE");



        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(11, "ONE");
        map1.put(32, "TWO");
        map1.put(53, "THREE");
        map1.put(54, "FOUR");
        map1.put(15, "FIVE");


        print(map);

    }

    private static void print(HashMap<Integer, String> map) {
        for (Map.Entry<Integer,String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
