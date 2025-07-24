package OptionalClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        File f = new File("vinu.txt");
        System.out.println(f.exists());

        FileWriter fw = new FileWriter(f);

        // we need to use \n for newline if we write inside the file using write() method
        fw.write("Hello Programming\n"); // -> \n -> it is used for new/next line
        fw.write("Java Programming\n");
        fw.write(48); // if we pass integer value without using quotes then it will take that integer as ASCII value and write its number/alphabet etc according to its ASCII value

        char[] ch = {'a','b','c'};
        fw.write(ch);


        // we don't need to use \n for newline if we use append() method
        fw.append("hello world");
        fw.append("Hello Programming");
        fw.append("Java Programming");



        // When you write to a file in Java, the text isn't always saved right away. It’s first stored in memory (a temporary holding area called a buffer).
        // If you don’t use flush() or close(), and the program ends suddenly:
        // The data might still be sitting in memory.
        // So the file on disk might be empty or missing some content.
        fw.flush();
    }
}
