package activity.todo;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class AddNoteActivity {
    public Button saveNoteButton;
    public Button saveAndNewNoteButton;
    public Button closeButton;
    public TextBox titleTextBox;
    public TextBox noteTextBox;

    public AddNoteActivity(){
        saveNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
        saveAndNewNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveAndNew"));
        closeButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]"));
        titleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        noteTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    }
}
