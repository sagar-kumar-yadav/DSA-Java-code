package sagar;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapLearn {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        map.remove("three");

        System.out.println(map);
        System.out.println(map.containsValue(5));

        System.out.println(map.isEmpty());
    }
}
