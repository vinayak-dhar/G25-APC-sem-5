package LambdaExpression;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
//        InterfImplemtation i = new InterfImplemtation();
//        i.m1();


//        we can make reference to a interface and the object to the class
//        in this we are making a reference to the interf Interface and using the m1 function using the lambda function
//        Interf j = () -> System.out.println("hello vinayak");
//        j.m1();

//        Interf i = (int a, int b) -> System.out.println(a+b);
//        i.m1(8,7);
//        i.m1(4,20);

//      Predicate<Input datatype> -> it have only one method i.e. test()
//        Predicate -> it can only return in true / false -> alternate of functional interface
        Predicate<Integer> j = (c) -> (c%2 == 0);
        System.out.println(j.test(12)); // in this .test is a predefined function in predicate


//        using predicate in string
        Predicate<String> s = (str) -> (str.length() > 5);
        System.out.println(s.test("hell"));

        Interf t = (int number) -> ((number > 0 && number % 5 == 0 ? true : false));
        System.out.println(t.m1(-5));




//        alternate of predicate / functional interface -> Function -> this will not only return in true or false we can get proper output of different datatype
//        Function<Input datatype, Output datatype> -> it have only one method i.e. apply()
        Function<String,Integer> F = (c) -> c.length();
        System.out.println(F.apply("hello"));
    }

}
