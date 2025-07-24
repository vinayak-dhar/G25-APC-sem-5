package HigherOrderFunction;

public class HOFExample {
    public static void main(String[] args) {
//        HOFExample hof = new HOFExample();
//        hof.print();
//        HOFExample.print(); // can't use this when the method is not static

//        Interf i = () -> System.out.println("m1() method is called");
//        i.m1();
//        print(i);


        // given a list of element get the square of the elements using higher order functions ->
        Interf i = (int a) -> a * a;
        int square = squareNum(5,i);
        System.out.println(square);
    }
    public static  void print(Interf i) {
//        i.m1();
        System.out.println("vinayak dhar");
    }


    public static int squareNum(int a, Interf i) {
        return i.m1(a);
    }
}


// Higher Order Functions ->
// if pass a method as a parameter inside a method is known as higher order function
// and the passed function should be passed using lambda expression
// we can't pass normal expression otherwise it will not execute

// advantages -> we can use both the method inside one method

// normal methods are those where we pass primitive or non-primitive data types as a parameter inside a method