package activity.todo;

import appiumControl.Button;
import appiumControl.CheckBox;
import appiumControl.Label;
import org.openqa.selenium.By;
import sessionManager.Session;

public class MainActivity {
    public Button searchButton;
    public Button plusButton;
    public Button moreOptionsButton;

    public MainActivity(){
        moreOptionsButton = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"M\u00e1s opciones\"]"));
        plusButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        searchButton = new Button(By.id("com.vrproductiveapps.whendo:id/search"));
    }

    public void checkFirstNote(){
        String locator = "(//android.widget.ImageButton[@content-desc=\"Marcar como Hecha\"])[1]";
        CheckBox fistCheckBox = new CheckBox(By.xpath(locator));
        if (fistCheckBox != null) {
            fistCheckBox.check();
        }
    }

    public boolean isNoteDisplayed(String noteTitle){
        String locator = "//android.widget.TextView[@text='"+noteTitle+"']";
        Label note = new Label(By.xpath(locator));
        return note.isDisplayed();
    }

    public int countNotes(){
        // Workaround
        String locator = "//android.widget.ImageButton[@content-desc=\"Marcar como Hecha\"]";
        int numNotes = Session.getInstance().getDriver().findElements(By.xpath(locator)).size();
        return numNotes;
    }
}
