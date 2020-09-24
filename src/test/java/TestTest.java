import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestTest {

    private AppiumDriver driver;

    @Before
    public void iniciando() throws MalformedURLException {
        System.out.println("iniciando");
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","Galaxy Tab A (2016)");
        capabilities.setCapability("platformVersion","5.1.1");
        capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
        capabilities.setCapability("appActivity",".Calculator");
        capabilities.setCapability("platformName","Android");

        this.driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @Test
    public void myFirstTest(){
        // press9
        this.driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"9\"]")).click();
        // press+
        this.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add")).click();
        // press5
        this.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05")).click();
        // press=
        this.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal")).click();

        //verification
        String actualResult = this.driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult")).getText();
        String expectedResult = "14";

        Assert.assertEquals("Error! Suma incorrecta ", expectedResult, actualResult);

    }
    @Test
    public void myFirstTest2(){
        System.out.println("TEST2!");
    }

    @After
    public void finalizando(){

        this.driver.quit();
    }
}
