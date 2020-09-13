package service;


import domain.Note;
import repo.NoteRepo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class AddNoteServiceImpl {

    public AddNoteServiceImpl() {
    }

    private static final String WHITE_SPACE = "\\s+";
    public void addNote(String rest){

        //date,time,type,interaction with people: "@naveen, @manos, @john",tags: #aks, #cluster, #azure,note

        NoteRepo noteRepo = new NoteRepo();
        List<String> args = Arrays.asList(rest.split(WHITE_SPACE));
        List<String> interaction = findInteractions(args);
        List<String> tags = findTags(args);

        String noteStr = findNote(args);
        Note note = new Note(noteRepo.getIndex(),new Date(),interaction,tags,noteStr);
        noteRepo.addNote(note);

        System.out.println("Note Added");
    }

    private String findNote(List<String> args) {
        return args.stream().filter(arg -> arg.startsWith("\"")).collect(Collectors.toList()).get(0);
    }

    private List<String> findTags(List<String> args) {
        return args.stream().filter(arg->arg.startsWith("#")).collect(Collectors.toList());
    }

    private List<String> findInteractions(List<String> args) {
        return args.stream().filter(arg->arg.startsWith("@")).collect(Collectors.toList());

    }
}
