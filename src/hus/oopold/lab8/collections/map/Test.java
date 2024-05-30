package hus.oopold.lab8.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
// Test count method
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 10);
        map1.put(2, 20);
        map1.put(3, 30);
        System.out.println("Map size: " + Maps.count(map1));

        // Test empty method
        Maps.empty(map1);
        System.out.println("Map emptied. Size now: " + Maps.count(map1));

        // Test contains method
        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(1, 100);
        map2.put(2, 200);
        System.out.println("Map contains key 1: " + Maps.contains(map2, 1));

        // Test containsKeyValue method
        System.out.println("Map contains key-value pair 2-200: " + Maps.containsKeyValue(map2, 2, 200));

        // Test keySet method
        Map<Integer, Integer> map3 = new HashMap<>();
        map3.put(1, 1000);
        map3.put(2, 2000);
        System.out.println("Map key set: " + Maps.keySet(map3));

        // Test values method
        Map<Integer, Integer> map4 = new HashMap<>();
        map4.put(1, 10000);
        map4.put(2, 20000);
        System.out.println("Map values: " + Maps.values(map4));

        // Test getColor method
        System.out.println("Color for value 0: " + Maps.getColor(0));
        System.out.println("Color for value 1: " + Maps.getColor(1));
        System.out.println("Color for value 2: " + Maps.getColor(2));
        System.out.println("Color for value 3: " + Maps.getColor(3));

    }
}
