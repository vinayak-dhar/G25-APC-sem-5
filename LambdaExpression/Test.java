package LambdaExpression;

public class Test {
    public static void main(String[] args) {
        InterfImplemtation i = new InterfImplemtation();
        i.m1();


//        we can make reference to a interface and the object to the class
//        in this we are making a reference to the interf Interface and using the m1 function using the lambda function
        Interf j = () -> System.out.println("hello vinayak");
        j.m1();
    }
}
