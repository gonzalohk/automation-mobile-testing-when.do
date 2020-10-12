package deviceFactory;

import io.appium.java_client.MobileElement;

public class FactoryDevice {

    public static IDevice make(String type){
        IDevice device;
        switch (type){
            case "ios":
                device = new IOSDriver();
                break;
            case "browserstack":
                device = new BrowserStack();
                break;
            case "windowsphone":
                device = new WindowsPhoneDriver();
                break;
            case "android":
            default:
                device = new AndroidDriver<MobileElement>();
                break;
        }
        return device;
    }
}
