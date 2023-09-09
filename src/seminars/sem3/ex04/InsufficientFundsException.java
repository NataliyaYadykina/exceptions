package seminars.sem3.ex04;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("The account hasn't enough money.");
    }

}
