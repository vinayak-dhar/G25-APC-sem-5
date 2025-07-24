package HigherOrderFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HOFExample1 {

    public static void main(String[] args) {
        Function<Integer, Integer> f = (n) -> n * n;
        List<Integer> list = Arrays.asList(1, 7, 2, 4, 5, 6);
        HOFExample1 h1 = new HOFExample1();
        System.out.println(h1.square(f,list));

    }
    public ArrayList<Integer> square(Function<Integer,Integer> f, List<Integer> list) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (Integer a : list) {
            arrlist.add(f.apply(a));
        }
        return arrlist;
    }
}