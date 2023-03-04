import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {
    public static void main(String[] args) throws MalformedURLException {

       DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
       caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3");
       caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
       caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
       String appURL = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
               + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";

       URL url = new URL ("http://0.0.0.0:4723/wd/hub");

        AppiumDriver driver = new AndroidDriver(url, caps);



    }

//    public static AppiumDriver initializeDriver(String android) {
//        return null;
//    }
}