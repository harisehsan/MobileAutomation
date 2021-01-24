//package global.APP.starter;
//
//import global.APP.pageObjects.IntroPageObjects;
//import global.Drivers;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//public class TestExample2 {
//
//    public Drivers drv = new Drivers();
//    IntroPageObjects introObj = new IntroPageObjects();
//
//    @Parameters({"platformName","deviceName","platformVersion","udid","port","systemPort"})
//    @Test
//    public void testLoginAndLogout(String platformName, String deviceName, String platformVersion, String udid, String port, String systemPort) throws Exception{
//        drv.MultipleDriver2(port, platformName, platformVersion, deviceName, udid, systemPort );
//        introObj.skipBtn.click();
//    }
//
//    @AfterMethod
//    public void treadDown(){
//        drv.closeDriver();
//    }
//
//
//}
