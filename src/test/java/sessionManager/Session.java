package sessionManager;

import deviceFactory.FactoryDevice;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class Session {
    public static Session session= null;
    private AppiumDriver driver;
    private Session() throws MalformedURLException {
        driver = FactoryDevice.make("android").create();
    }

    public static Session getInstance(){
        if (session == null){
            session = new Session();
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
