package ExceptionHandling;

public class ThrowExample {
    static int age = 15;
    public static void main(String[] args) {
        if (age < 18) {
            // used to create custom exception
            throw new VotingAge("you are not eligible for voting");
        }
        else {
            System.out.println("you are eligible for voting");
        }
    }
}
