package global;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class Drivers {

    public static AppiumDriver<WebElement> driver;
    public DesiredCapabilities cap;

    public AppiumDriver Android_Launch_LazadaApp_GalaxyJ7() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "3300b636b659b293");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.daraz.android");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lazada.activities.EnterActivity");
        driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.setLogLevel(Level.INFO);

        WebDriverRunner.setWebDriver(driver);

        Assert.assertNotNull(driver);

        return driver;
    }

    public AppiumDriver Android_Launch_LazadaApp_GalaxyS8() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ce11171b640a1e3404");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.daraz.android");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lazada.activities.EnterActivity");
        driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4722/wd/hub"), cap);
        driver.setLogLevel(Level.INFO);

        WebDriverRunner.setWebDriver(driver);

        Assert.assertNotNull(driver);

        return driver;
    }

    public AppiumDriver IOS_Launch_LazadaApp_iphone8() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability("platformName", "iOS");
        cap.setCapability("deviceName", "Real iphone 8");
        cap.setCapability("platformVersion", "12.1");
        cap.setCapability("bundleId", "com.LazadaSEA.Lazada");
        cap.setCapability("udid", "90ebc26513810e02ee05fc99f08482c739332e03");
        //cap.setCapability("wdaLocalPort","8205");

        cap.setCapability("noReset", true);
        cap.setCapability("fullReset", false);

        driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4730/wd/hub"), cap);

        Assert.assertNotNull(driver);

        WebDriverRunner.setWebDriver(driver);

        return driver;
    }


    public AppiumDriver MultipleDriver(String platformName, String deviceName, String platformVersion, String udid, String port, String systemPort) throws MalformedURLException {
        cap = new DesiredCapabilities();
        if (platformName.equals("iOS")) {
            cap.setCapability("platformVersion", platformVersion);
            cap.setCapability("bundleId", "com.LazadaSEA.Lazada");
            cap.setCapability("platformName", platformName);
            cap.setCapability("deviceName", deviceName);
            cap.setCapability("udid", udid);
            //cap.setCapability("wdaLocalPort","8205");
        }
        if (platformName.equals("Android")) {
            //cap.setCapability("app", "/Users/nikita.bokarev/Desktop/app for testing/600000@lazada_6.25.1.apk");
            cap.setCapability("platformName", platformName);
            cap.setCapability("deviceName", deviceName);
            cap.setCapability("udid", udid);
            cap.setCapability("automationName", "UiAutomator2");
            //cap.setCapability("systemPort",systemPort);
            cap.setCapability("appActivity", "com.lazada.activities.EnterActivity");
            cap.setCapability("appPackage", "com.lazada.android");
        }
        cap.setCapability("noReset", true);
        cap.setCapability("fullReset", false);
        if (platformName.equals("iOS"))
            driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:" + port + "/wd/hub"), cap);
        else if (platformName.equals("Android"))
            driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:" + port + "/wd/hub"), cap);
        Assert.assertNotNull(driver);

        WebDriverRunner.setWebDriver(driver);

        return driver;
    }


    public void MultipleDriver2(String port, String platform, String platformVersion, String deviceName, String udid, String systemPort) throws Exception {
        URL url = new URL("http://0.0.0.0:" + port + "/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        capabilities.setCapability(MobileCapabilityType.UDID, udid);
        capabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lazada.activities.EnterActivity");
        //capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.lazada.android.*");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.lazada.android");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/nikita.bokarev/Desktop/app for testing/600000@lazada_6.25.1.apk");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "100000");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_DURATION, "100000");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_PACKAGE, "100000");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, "false");
        driver = new AndroidDriver<WebElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void MultipleDriver3(String port, String platform, String platformVersion, String deviceName, String udid, String systemPort) throws Exception {
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, udid);
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.daraz.android");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lazada.activities.EnterActivity");
        driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:" + port + "/wd/hub"), cap);
        driver.setLogLevel(Level.INFO);

        WebDriverRunner.setWebDriver(driver);

        Assert.assertNotNull(driver);
    //    driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:" + port + "/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void MultipleDriver4(String port, String platform, String platformVersion, String deviceName, String udid, String systemPort) throws Exception {
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, udid);
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.daraz.android");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lazada.activities.EnterActivity");
        driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:" + port + "/wd/hub"), cap);
        driver.setLogLevel(Level.INFO);
        WebDriverRunner.setWebDriver(driver);
        Assert.assertNotNull(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
        public AppiumDriver getDriver ()
        {
            return driver;
        }

        public void closeDriver () {
            driver.quit();
        }
    }


/*
adb -s UEEDU18526003357 uninstall io.appium.uiautomator2.server
adb -s UEEDU18526003357 uninstall io.appium.uiautomator2.server.test
adb -s UEEDU18526003357 uninstall io.appium.unlock
adb -s UEEDU18526003357 uninstall io.appium.settings
 */

/*
os.popen("adb uninstall io.appium.uiautomator2.server.test")
os.popen("adb uninstall io.appium.uiautomator2.server")
os.popen("adb install -r "+PATH("../app/appium-uiautomator2-server-v0.1.9.apk"))
os.popen("adb install -r "+PATH("../app/appium-uiautomator2-server-debug.androidTest.apk"))
 */



/*
adb -s P6LDU17113003345 uninstall io.appium.uiautomator2.server
adb -s P6LDU17113003345 uninstall io.appium.uiautomator2.server.test
adb -s P6LDU17113003345 uninstall io.appium.unlock
adb -s P6LDU17113003345 uninstall io.appium.settings
 */





