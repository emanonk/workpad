package service;


import domain.Note;
import repo.NoteRepo;

import java.util.stream.Collectors;

public class GetNotesServiceImpl {

    public GetNotesServiceImpl() {
    }

    public String getNotes() {

        //date,time,type,interaction with people: "@naveen, @manos, @john",tags: #aks, #cluster, #azure,note


        NoteRepo noteRepo = new NoteRepo();

        return noteRepo.getNotes().stream()
                .map(Note::toString)
                .collect(Collectors.joining("\n"));
    }


}
