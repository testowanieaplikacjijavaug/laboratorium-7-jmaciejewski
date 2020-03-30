import java.util.ArrayList;
import java.util.List;

public class NotesStorageMock implements NotesStorage{

    ArrayList<Note> notes;

    NotesStorageMock(ArrayList<Note> notes){
        this.notes=notes;
    }

    @Override
    public void add(Note note) {
        this.notes.add(note);
    }

    @Override
    public List<Note> getAllNotesOf(String name) {
        return notes;
    }

    @Override
    public void clear() {
        notes.clear();
    }
}
