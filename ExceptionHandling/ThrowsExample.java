package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            m1();
        }
        catch (IOException e) {
            System.out.println("incorrect file path");
        }
    }
    // throws is used not used to throw exception it is used to delicate the exception
    public static void m1() throws IOException {
        FileReader fr = new FileReader("test.txt");
    }
}
