package command;


import commandConfig.AbstractCommand;
import service.AddNoteServiceImpl;
import service.GetNotesServiceImpl;

import java.util.List;


public class ViewNotesCommand extends AbstractCommand {

    private GetNotesServiceImpl getNotesService;

    public ViewNotesCommand(String commandName, GetNotesServiceImpl getNotesService) {
        super(commandName);
        this.getNotesService = getNotesService;
    }

    @Override
    public void execute(String args) {

        System.out.println(getNotesService.getNotes());


    }



}
