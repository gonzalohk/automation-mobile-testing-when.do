package appiumControl;

import org.openqa.selenium.By;

public class TextBox extends Control {
    public TextBox(By locator){
        super(locator);
    }

    public void write(String value){
        this.findControl();
        this.control.sendKeys(value);
    }
}
