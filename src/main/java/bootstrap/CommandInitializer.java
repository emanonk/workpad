package bootstrap;




import command.AddNoteCommand;
import command.ViewNotesCommand;
import commandConfig.AbstractCommand;
import commandConfig.Command;
import service.AddNoteServiceImpl;
import service.GetNotesServiceImpl;

import java.util.HashMap;
import java.util.Map;


public class CommandInitializer {

    public Map<String, Command> getCommands() {
        Map<String, Command> commandMap = new HashMap<>();

        //Initialise commands
        AbstractCommand addnote = new AddNoteCommand("Add",new AddNoteServiceImpl());
        AbstractCommand addnote1 = new AddNoteCommand("add",new AddNoteServiceImpl());

        AbstractCommand getNote = new ViewNotesCommand("view",new GetNotesServiceImpl());


        //Add commands to commandList
        commandMap.put(addnote.getCommandName(), addnote);
        commandMap.put(addnote1.getCommandName(), addnote1);

        commandMap.put(getNote.getCommandName(), getNote);

        return commandMap;
    }
}
