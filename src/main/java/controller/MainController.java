package controller;


import bootstrap.ArgumentsFilterService;
import bootstrap.CommandInitializer;
import bootstrap.CommandService;
import bootstrap.KeyBoardInputService;
import commandConfig.Command;
import exception.CommandNotFoundException;

import java.util.List;
import java.util.Scanner;

public class MainController {

    private static final int COMMAND_INDEX = 0;

    private CommandInitializer commandInitializer;
    private CommandService commandService;
    private ArgumentsFilterService argumentsFilterService;
    private KeyBoardInputService keyBoardInputService;


    public MainController(CommandInitializer commandInitializer, CommandService commandService,
                          ArgumentsFilterService argumentsFilterService, KeyBoardInputService keyBoardInputService) {
        this.commandInitializer = commandInitializer;
        this.commandService = commandService;
        this.argumentsFilterService = argumentsFilterService;
        this.keyBoardInputService = keyBoardInputService;
    }

    public void run() {
        commandRunner();
    }

    private void commandRunner() {

        //check app properties
        //properties contain below

        //all commands and default shortcuts
        //folder path for your project
        //check folder structure if everything is good


        //if not exist
        //generate a new setup
        //generate folder structure

        //if exist be ready to accept a command


        //swing window
        //terminal loop
        //terminal command

        //web application



        Scanner scanner = new Scanner(System.in);
        String readKeyboardCommand = "";


        while (!readKeyboardCommand.equalsIgnoreCase("exit")) {

            if(scanner.hasNextLine()) {
                readKeyboardCommand = scanner.nextLine();
            }
            List<String> inputArguments = argumentsFilterService.getInputArguments(readKeyboardCommand);
            try {
                String remain = argumentsFilterService.removeCommandAndGetArgsAsString(inputArguments);
                Command command = commandService.findCommand(commandInitializer.getCommands(), inputArguments.get(COMMAND_INDEX));
                command.execute(remain);
            } catch (CommandNotFoundException e) {
                System.out.println("you need help");
            }


        }

    }

}
