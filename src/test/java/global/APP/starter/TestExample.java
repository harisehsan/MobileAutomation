//package global.APP.starter;
//
//import global.Drivers;
//import org.testng.annotations.*;
//
//public class TestExample {
//
//    public Drivers drv = new Drivers();
//    @BeforeTest
//    @Parameters({"platformName","deviceName","platformVersion","udid","port","systemPort"})
//    public void setup(String platformName, String deviceName, String platformVersion, String udid, String port, String systemPort) throws Exception {
//        drv.MultipleDriver(platformName, deviceName, platformVersion, udid, port, systemPort);
//    }
//
//    @Test
//    public void testLoginAndLogout() throws Exception{
//        System.out.println("поток");
//    }
//
//    @AfterTest
//    public void treadDown(){
//       drv.closeDriver();
//    }
//}
