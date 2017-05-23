package demodatabasecrud.android.myapplicationdev.com.demodatabasecrud;

import java.io.Serializable;

/**
 * Created by 15031795 on 23/5/2017.
 */

public class Note implements Serializable {
    private Integer id;
    private String noteContent;

    public Note(Integer id, String noteContent) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public Integer getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
    @Override
    public String toString() {
        return "ID:" + id + ", " + noteContent;
    }
}

