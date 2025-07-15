package Test;

public class Test {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(10/0);
            System.out.println(str.length());
        }
        catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        }
        catch (NullPointerException e) {
            System.out.println("null is not allowed");
        }
    }
}
