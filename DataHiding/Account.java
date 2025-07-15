package DataHiding;

public class Account {
    String name;
    int age;
    // this type of variable cannot be accessed outside of its own class
    private int balance;
    private String password;

    // getter and setter in oops
    int getBalance() {
        return balance;
    }
    String getPassword() {
        return password;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }
    void setPassword(String password) {
        this.password = password;
    }
}
