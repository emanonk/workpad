package bootstrap;



import commandConfig.Command;
import exception.CommandNotFoundException;

import java.util.Map;

public interface CommandService {

    Command findCommand(Map<String, Command> commandMap, String commandName) throws CommandNotFoundException;
}
