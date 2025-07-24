package OptionalClass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String s1 = "vinayak";
        String s2 = "";
        String s3 = null;
        System.out.println(s1.length());
        System.out.println(s2.length());
//        System.out.println(s3.length());

//        Optional<String> op = Optional.ofNullable(s1);
//        System.out.println(op.get());

//        Optional<String> op = Optional.ofNullable(s3);
//        System.out.println(op.orElse("hello")); // if null then else statement is run i.e. "hello" will be printed
//        if (op.isPresent()) System.out.println(op.get()); // nothing will be printed

        Optional<String> op = Optional.ofNullable(s1);
        if (op.isPresent()) System.out.println(op.get());
    }
}
