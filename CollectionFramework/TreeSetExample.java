package CollectionFramework;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

class MyComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        if (i1 < i2) return +1;
        else if (i1 > i2) return -1;
        else return 0;
    }
}

public class TreeSetExample {
    public static void main(String[] args) {
//        TreeSet<Integer> ts = new TreeSet<>();
//        ts.add(8);
//        ts.add(9);
//        ts.add(1);
//        ts.add(0);
//        ts.add(5);
//        ts.add(13);
//        ts.add(10);
//        System.out.println(ts);


        // using custom comparator to store in descending order
//        TreeSet<Integer> ts = new TreeSet<>((a,b) -> Integer.compare(b,a));
//        ts.add(8);
//        ts.add(9);
//        ts.add(1);
//        ts.add(0);
//        ts.add(5);
//        ts.add(13);
//        ts.add(10);
//        System.out.println(ts);

        TreeSet<Integer> ts = new TreeSet<>(new MyComparator());
        ts.add(8);
        ts.add(9);
        ts.add(1);
        ts.add(0);
        ts.add(5);
        ts.add(13);
        ts.add(10);
        System.out.println(ts);



    }
}

/*
    TreeSet:
        - it is a type of data structure which stores homogeneous data
        - cannot store null value
        -


     comparator and comparable -> both are interface
     comparable -> it have a method tocompare method which is used in treeset to sort the data only in ascending order
     comparator ->
 */
