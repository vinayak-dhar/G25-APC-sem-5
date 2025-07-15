package DataHiding;

public class Hidding {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.name = "vinayak dhar";
        acc.age = 21;
        System.out.println(acc.name + " " + acc.age);

//        this cannot be changed outside of Account class
//        acc.balance = 100.9;
//        acc.password = "helloworld";

        acc.setBalance(1000);
        acc.setPassword("helloworld");
        System.out.println(acc.getBalance());
        System.out.println(acc.getPassword());

    }
}
