package test;

import activity.todo.MainActivity;
import org.junit.Test;

import java.net.MalformedURLException;

public class TodoTest {
    MainActivity mainActivity= new MainActivity();

    @Test
    public void addNote() throws MalformedURLException {
        mainActivity.plusButton.click();
        mainActivity.titleTextBox.write("title test");
        mainActivity.NoteTextBox.write("Note test");
        mainActivity.addNoteButton.click();

        //Verification
    }
}
