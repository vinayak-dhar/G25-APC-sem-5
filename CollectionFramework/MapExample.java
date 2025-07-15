package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"wasif");
        map.put(2,"vansh");
        map.put(3,"rohit");
        System.out.println(map);


        Map<Integer,String> map1 = new HashMap<>();
        map1.put(4,"Shubham");
        map.put(2,"Ayush"); // if the key are same it the last one that is put with same key will overwrite the previous one
        map.putAll(map1);
        map1.put(6,"sparsh");
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.containsKey(5));
        System.out.println(map.values());
        System.out.println(map.isEmpty());
    }

}

// Map ->
    // it doesn't come under collection
    // it is not legacy
    // implementation of Map, SortedMap and NavigableMap interfaces
    // elements stored in key-value pairs and both are objects
    // it will not allow duplicate elements at keys side, but it able to allow duplicate elements at values side
    // it will not follow insertion order
    // it will follow sorting order
    // it will not allow null values at keys side
    // it will not allow heterogeneous elements at keys side
    // it able to allow only comparable objects at keys side by default