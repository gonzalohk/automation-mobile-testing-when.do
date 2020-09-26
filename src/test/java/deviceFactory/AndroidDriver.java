package deviceFactory;

import configuration.Conf;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriver implements IDevice {

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(Conf.DEVICE_NAME, Conf.DEVICE_NAME_VALUE);
        capabilities.setCapability(Conf.PLATFORM_VERSION, Conf.PLATFORM_VERSION_VALUE);
        capabilities.setCapability(Conf.APP_PACKAGE, Conf.APP_PACKAGE_VALUE);
        capabilities.setCapability(Conf.APP_ACTIVITY, Conf.APP_ACTIVITY_VALUE);
        capabilities.setCapability(Conf.PLATFORM_NAME, Conf.PLATFORM_NAME_VALUE);

        AppiumDriver driver=new io.appium.java_client.android.AndroidDriver(new URL(Conf.APPIUM_SERVER),capabilities);
        driver.manage().timeouts().implicitlyWait(Conf.DEFAULT_IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
