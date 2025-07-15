package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        System.out.println(al);

        Iterator it = al.iterator();
        String element = (String) it.next();
        element = (String) it.next();
        element = (String) it.next();
        System.out.println(element);
        if (element.equals("C")) {
            it.remove();
        }

        System.out.println(al);
    }
}


/*
    Iterator->
        - it is an interface
        - can be used to retrieve all the element from collection objects in one by one fashion


    boolean hasNext() ->
     - it will return true/false if next element is existed/not existed
     - if next element is existed then read next element and move cursor to next position by using the following method


    public Object next() ->
     -
 */