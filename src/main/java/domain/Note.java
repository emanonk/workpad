package domain;

import java.util.Date;
import java.util.List;

public class Note {

    private Long id;
    private Date date;
    private List<String> interactions;
    private List<String> tags;
    private String note;

    public Note(Long id, Date date, List<String> interactions, List<String> tags, String note) {
        this.id = id;
        this.date = date;
        this.interactions = interactions;
        this.tags = tags;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getInteractions() {
        return interactions;
    }

    public void setInteractions(List<String> interactions) {
        this.interactions = interactions;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", date=" + date +
                ", interactions=" + interactions +
                ", tags=" + tags +
                ", note='" + note + '\'' +
                '}';
    }
}
