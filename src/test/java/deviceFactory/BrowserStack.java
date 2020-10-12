package deviceFactory;

import java.net.URL;
import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserStack implements IDevice{

    public static String userName = "gonzalo73";
    public static String accessKey = "XhNJFhBfc3ARUy3CpCnt";


    @Override
    public AppiumDriver create() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", userName);
        caps.setCapability("browserstack.key", accessKey);

        // Set URL of the application under test
        caps.setCapability("app", "bs://3a8290da7abf3de00b53b6ea09e2889236a8d280");

        // Specify device and os_version for testing
        caps.setCapability("device", "Samsung Galaxy A51");
        caps.setCapability("os_version", "10.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "Java Android");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AppiumDriver driver = new AndroidDriver<AndroidElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);

        return driver;
    }
}
