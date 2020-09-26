package test;

import activity.todo.AddNoteActivity;
import activity.todo.ConfirmationActivity;
import activity.todo.MainActivity;
import activity.todo.MoreOptionsActivity;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class WhenDoTest {
    MainActivity mainActivity = new MainActivity();
    AddNoteActivity addNoteActivity = new AddNoteActivity();
    MoreOptionsActivity moreOptionsActivity = new MoreOptionsActivity();
    ConfirmationActivity confirmationActivity = new ConfirmationActivity();

    @Test
    public void addNote() throws MalformedURLException {
        //Steps
        mainActivity.plusButton.click();
        addNoteActivity.titleTextBox.write("title test");
        addNoteActivity.noteTextBox.write("Note test");
        addNoteActivity.saveNoteButton.click();

        //Verification
        Assert.assertTrue("New note was not created", mainActivity.isNoteDisplayed("title test"));
    }

    @Test
    public void addNotes() throws MalformedURLException {
        //Steps
        mainActivity.plusButton.click();
        addNoteActivity.titleTextBox.write("title test 1");
        addNoteActivity.noteTextBox.write("Note test 1");
        addNoteActivity.saveAndNewNoteButton.click();

        addNoteActivity.titleTextBox.write("title test 2");
        addNoteActivity.noteTextBox.write("Note test 2");
        addNoteActivity.saveNoteButton.click();

        //Verification
        Assert.assertTrue("First new note was not created", mainActivity.isNoteDisplayed("title test 1"));
        Assert.assertTrue("Second new note was not created", mainActivity.isNoteDisplayed("title test 2"));
    }

    @Test
    public void removeNote() {
        //Steps
        int numNotes = mainActivity.countNotes();
        mainActivity.checkFirstNote();
        mainActivity.moreOptionsButton.click();
        moreOptionsActivity.deleteButton.click();
        confirmationActivity.deleteButton.click();

        //Verification
        Assert.assertEquals("Error, Note was not deleted", numNotes -1, mainActivity.countNotes());
    }
}
