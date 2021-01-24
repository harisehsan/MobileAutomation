package global.APP.starter;

import cucumber.api.testng.TestNGCucumberRunner;
import global.Drivers;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;

public class BaseRunner{

    public TestNGCucumberRunner testNGCucumberRunner;
    public Drivers drv = new Drivers();


    @BeforeClass(alwaysRun = true)
    @Parameters({"platformName","deviceName","platformVersion","udid","port","systemPort"})
    //public void testLoginAndLogout(String platformName, String deviceName, String platformVersion, String udid, String port, String systemPort) throws Exception {
    public void setUpClass(String platformName, String deviceName, String platformVersion, String udid, String port, String systemPort) throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        System.out.println("Device Name:"+ deviceName);
//        if(deviceName.equalsIgnoreCase("Galaxy S8+"))
//           drv.Android_Launch_LazadaApp_GalaxyJ7();
//            drv.Android_Launch_LazadaApp_GalaxyS8();
//        if(deviceName.equalsIgnoreCase("HARRY's galaxy J7"))

//        drv.IOS_Launch_LazadaApp_iphone8();
//        drv.MultipleDriver2(port, platformName, platformVersion, deviceName, udid, systemPort );
        drv.MultipleDriver3(port, platformName, platformVersion, deviceName, udid, systemPort);
  //  if()    drv.MultipleDriver4(port, platformName, platformVersion, deviceName, udid, systemPort);


    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();

    }

    @AfterTest(alwaysRun = true)
    public void teardownBrowser() throws Exception {
        //driver.quit();
    }
}
