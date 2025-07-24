package FileOperation;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            File f = new File("test.txt");
            System.out.println(f.exists()); // checks whether test.txt exist inside the current directory
            f.createNewFile(); // creates a new file in the current directory

            File f1 = new File("vinu.txt");
            f1.createNewFile();

            File f2 = new File("java");
            f2.mkdir();

            File f3 = new File(f2,"java.txt"); // this creates a new directory java in the current directory and java.txt is inside java directory
            f3.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
