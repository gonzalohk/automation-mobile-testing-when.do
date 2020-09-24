package deviceFactory;

public class FactoryDevice {

    public static IDevice make(String type){
        IDevice device;
        switch (type){
            case "ios":
                device = new IOSDriver();
                break;
            case "windowsphone":
                device = new WindowsPhoneDriver();
                break;
            case "android":
            default:
                device = new AndroidDriver();
                break;
        }
        return device;
    }
}
