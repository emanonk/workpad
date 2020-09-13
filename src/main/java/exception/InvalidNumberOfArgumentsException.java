package exception;

public class InvalidNumberOfArgumentsException extends RuntimeException{

    private static final String MESSAGE = "Error:Invalid number of arguments";

    public InvalidNumberOfArgumentsException() {
        super(MESSAGE);
    }
}
