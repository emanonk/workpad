package repo;

import domain.Note;

import java.util.List;


public class NoteRepo {



    public NoteRepo() {
    }

    public void addNote(Note note) {
        DBTemp.notes.add(note);
    }

    public List<Note> getNotes(){
        return DBTemp.notes;
    }

    public Long getIndex(){
        return Long.valueOf(DBTemp.notes.size());
    }

}
