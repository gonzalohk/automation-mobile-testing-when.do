package activity.todo;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class MainActivity {
    public Button plusButton;
    public Button addNoteButton;
    public TextBox titleTextBox;
    public TextBox NoteTextBox;
    public CheckBox [] checkBoxes;

    public MainActivity(){
        plusButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        addNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
        titleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        NoteTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));

    }
}
