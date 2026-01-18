package basic;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //khai bao hashmap
//        HashMap<String, Integer> myMap = new HashMap<>();
//        myMap.put("John", 2);
//        myMap.put("John", 5);
//        myMap.put("Alice", 2);
//        myMap.put("Tom", 3);
//        System.out.println(myMap);

        System.out.println("--------------------------");
        List<String> myListName = Arrays.asList("John", "Alice", "Tom", "Tom", "Tom", "Alice", "John");
        HashMap<String, Integer> myNameMap = new HashMap<>();
        System.out.println(myNameMap); // empty
        for (String name : myListName) {
            if(myNameMap.containsKey(name)) {
                int currentValue = myNameMap.get(name);
                currentValue++;
                myNameMap.put(name, currentValue);
            } else {
                myNameMap.put(name, 1); // sau khi put key -> count 1
            }
        }
        System.out.println(myNameMap); // co gia tri {key1: value1, key2: value2, ...}

        System.out.println("---------------------------");
        Set<String> keys = myNameMap.keySet();
        System.out.println(keys); // in ra tat ca cac keys

        System.out.println("---------------------------");
        Set<Map.Entry<String, Integer>> entrySet = myNameMap.entrySet();
        //cach 1: lap bang iterator
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
        }

        System.out.println("---------------------------");
        //cach 2: lap bang for each
        for(Map.Entry<String, Integer> entry: myNameMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " , Value: " + entry.getValue());
        }

        System.out.println("------------------------------");
        TreeMap<String, Integer> myTreeMap = new TreeMap<>();
        myTreeMap.put("John", 2);
        myTreeMap.put("Alice", 2);
        myTreeMap.put("Tom", 3);
        System.out.println(myTreeMap);

    }
}
