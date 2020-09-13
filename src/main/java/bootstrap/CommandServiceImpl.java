package bootstrap;



import commandConfig.Command;
import exception.CommandNotFoundException;

import java.util.Map;
import java.util.Optional;

public class CommandServiceImpl implements CommandService {


    @Override
    public Command findCommand(Map<String, Command> commandMap, String commandName) throws CommandNotFoundException {
        return Optional.ofNullable(commandMap.get(commandName)).orElseThrow(CommandNotFoundException::new);
    }
}
