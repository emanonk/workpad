package commandConfig;

public abstract class AbstractCommand implements Command{

    private String commandName;

    public AbstractCommand(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public void execute(String note) {
        System.out.println("Executing "+ "'"+commandName+"'");
    }
}
