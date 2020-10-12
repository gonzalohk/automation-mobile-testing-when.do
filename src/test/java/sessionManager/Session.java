package sessionManager;

import deviceFactory.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;

import static configuration.Conf.SELECTED_DRIVER;

public class Session {
    public static Session session= null;
    private AppiumDriver driver;
    private Session() throws MalformedURLException {
        driver = FactoryDevice.make(SELECTED_DRIVER).create();
    }

    public static Session getInstance() {
        if (session == null){
            try {
                session = new Session();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return session;
    }

    public void closeSession (){
        driver.quit();
        session = null;
    }

    public AppiumDriver getDriver(){
        return driver;
    }
}
