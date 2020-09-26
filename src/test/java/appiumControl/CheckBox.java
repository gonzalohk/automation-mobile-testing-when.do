package appiumControl;

import org.openqa.selenium.By;

public class CheckBox extends Control {

    public CheckBox(By locator) {
        super(locator);
    }

    public void check(){
        // TODO Add implementation
        // Workaround
        click();
    }

    public void unCheck(){
        // TODO Add implementation
    }
}
