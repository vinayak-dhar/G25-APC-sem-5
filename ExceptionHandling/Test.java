package ExceptionHandling;

public class Test {
    public static void main(String[] args) {
        try {
//            System.out.println("inside try");
//            throw new RuntimeException("error");
            int[] arr = new int[5];
            arr[5] = 25;
        }
        catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("error");
        }
//        finally {
//            System.out.println("inside finally");
//        }
    }
}
