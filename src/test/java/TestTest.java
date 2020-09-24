import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

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
    }

    @Test
    public void myFirstTest(){
        System.out.println("TEST!");
    }
    @Test
    public void myFirstTest2(){
        System.out.println("TEST2!");
    }

    @After
    public void finalizando(){
        System.out.println("iniciando");
    }
}
