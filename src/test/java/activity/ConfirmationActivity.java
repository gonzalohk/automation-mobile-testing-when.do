package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class ConfirmationActivity {
    public Button deleteButton;

    public ConfirmationActivity() {
        deleteButton = new Button(By.id("android:id/button1"));
    }
}