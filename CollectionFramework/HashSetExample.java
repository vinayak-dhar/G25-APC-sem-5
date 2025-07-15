package CollectionFramework;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        System.out.println(hs);
    }
}

/*
    - direct child interface
    - not index based arrange in hashmap using formula like n%16
    - duplicates not allowed
    - not follow insertion order
    - LinkedHashSet allow insertion order
    - sorting order not followed
    - SortedSet, NavigableSet and TreeSet follow sorting order and not allow even single null value
    - allow only one null value
    - its internal data structure is hashtable
    - not synchronized -> and almost all methods are not synchronized
    - allows more than one thread at a time
    - follows parallel execution
    - improves performance of the applications
    - data is not consistent
    - not threadsafe
 */
