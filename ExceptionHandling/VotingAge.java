package ExceptionHandling;

public class VotingAge extends RuntimeException{
    public VotingAge(String message) {
        super(message);
    }
}
