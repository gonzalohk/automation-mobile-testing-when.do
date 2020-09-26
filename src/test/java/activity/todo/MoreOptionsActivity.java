package activity.todo;

import appiumControl.Button;
import org.openqa.selenium.By;

public class MoreOptionsActivity {
    public Button deleteButton;

    public MoreOptionsActivity() {
        deleteButton = new Button(By.xpath("//android.widget.TextView[@text='Eliminar Completadas']"));
    }
}
