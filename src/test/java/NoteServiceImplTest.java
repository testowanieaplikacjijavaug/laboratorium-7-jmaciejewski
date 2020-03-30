import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoteServiceImplTest {

    ArrayList<Note> notes;
    NotesService notesService;
    Note note;
    Note note2;
    Note note3;
    @BeforeEach
    public void set_up() {
        notes = new ArrayList<>();
        note = Note.of("test", 2.0f);
        notesService = NotesServiceImpl.createWith(new NotesStorageMock(notes));
    }

    @Test
    public void test_add_method(){
        notesService.add(note);

        assertEquals(1,notes.size());
        assertEquals(note, notes.get(0));
    }

    @Test
    public void test_averageOf_method(){
        note2 = Note.of("test", 4.0f);
        note3 = Note.of("test", 6.0f);
        notesService.add(note);
        notesService.add(note2);
        notesService.add(note3);
        assertEquals(4.0f,notesService.averageOf("test"),0.0000001);
    }

    @Test
    public void test_clear_method(){
        notesService.add(note);
        notesService.clear();
        assertEquals(0,notes.size());
    }

}
