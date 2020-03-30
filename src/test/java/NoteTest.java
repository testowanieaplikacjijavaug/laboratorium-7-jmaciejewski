import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NoteTest {
Note n;

    @Test
    public void test_pass() {
        n = Note.of("Jakub", 5.0f);

    }

    @Test
    public void test_name_null() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            n = Note.of(null, 5.0f);
        });
    }

    @Test
    public void test_name_empty() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            n = Note.of(" ", 5.0f);
        });
    }

    @Test
    public void test_note_too_low() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            n = Note.of("Jakub", 1.0f);
        });
    }

    @Test
    public void test_note_too_high() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            n = Note.of("Jakub", 7.0f);
        });
    }
}
