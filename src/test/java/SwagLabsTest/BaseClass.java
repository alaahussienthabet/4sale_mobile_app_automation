package SwagLabsTest;

import UI.UiActions;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


/**
 * base class that have all basic info and actions across all tests
 */
public class BaseClass {

    UiActions uiAction = new UiActions();
    DesiredCapabilities cap = new DesiredCapabilities();

    @BeforeMethod
    /**
     * function that switch to possible platforms that can use in tests and navigate to app
     * @optional to run tests by default value = (android)
     */
    public void beforeClass(@Optional("android") String platform) throws MalformedURLException {
        URL appiumUrl = new URL("http://127.0.0.1:4723/wd/hub");
        cap.setCapability("autoGrantPermissions", "true");
        cap.setCapability("ignoreHiddenApiPolicyError", "true");
        cap.setCapability("noReset", true);
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("resetKeyboard", true);
        cap.setCapability("platformVersion", "11");
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "lola");
        cap.setCapability("udid", "RFCRA0RZWLT");
        cap.setCapability("appPackage", "com.forsale.forsale");
        cap.setCapability("appActivity", "com.forsale.app.features.maincontainer.MainContainerActivity");

        switch (platform) {

            case "android": // run tests by android

                uiAction.driver = new AndroidDriver(appiumUrl, cap);

                break;
            case "iOS   ": //run tests by iOS

                break;
        }

        UiActions.wait = new WebDriverWait(UiActions.driver, Duration.ofSeconds(10));
    }


}
