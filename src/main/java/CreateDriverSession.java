import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CreateDriverSession {
    public static void main(String[] args) {

       DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
       caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
       caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
       caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

    }
}