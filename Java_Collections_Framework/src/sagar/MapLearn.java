package sagar;

import java.util.HashMap;
import java.util.Map;

public class MapLearn {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

//        if (!map.containsKey("two")){
//            map.put("two", 23);
//        }

//        map.putIfAbsent("two", 23);

        System.out.println(map);

        /*for (Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for (String key: map.keySet()) {
            System.out.println(key);
        }

        for (Integer value : map.values()){
            System.out.println(value);
        }*/

        System.out.println(map.containsValue(3));

        System.out.println(map.isEmpty());

        map.clear();
        System.out.println(map);
    }
}
