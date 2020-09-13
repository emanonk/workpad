package exception;

public class CommandNotFoundException extends RuntimeException{

    private static final String MESSAGE = "Error:Command not found";

    public CommandNotFoundException() {
        super(MESSAGE);
    }
}
