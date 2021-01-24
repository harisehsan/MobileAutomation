//package global.APP.starter;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.testng.CucumberFeatureWrapper;
//import cucumber.api.testng.PickleEventWrapper;
//import cucumber.api.testng.TestNGCucumberRunner;
//import global.Drivers;
//import org.testng.annotations.*;
//
//
//@CucumberOptions(
//        features="src/test/java/global/APP/features",
//        glue= "global.APP.stepsDefinitions",
//        format = "pretty"
//)
//
//public class CukesGlobalRunner{
//    private static TestNGCucumberRunner testNGCucumberRunner;
//    public Drivers drv = new Drivers();
//
//    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "scenarios")
//    public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
//        testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
//    }
//
//    @DataProvider
//    public Object[][] scenarios() {
//        return testNGCucumberRunner.provideScenarios();
//    }
//
//
//       // String platformName ="iOS";
//       // String deviceName ="Real iphone 8";
//       // String platformVersion ="12.1";
//       // String udid ="90ebc26513810e02ee05fc99f08482c739332e03";
//       // String port ="4740";
//
//    String platformName ="Android";
//    String deviceName ="HUAWEI COL-L29";
//    String platformVersion ="9";
//    String udid ="null";
//    String port ="4730";
//
//    @Parameters({"platformName","deviceName","platformVersion","udid","port","systemPort"})
//    @BeforeClass(alwaysRun = true)
//    public void setUpClass(String platformName, String deviceName, String platformVersion, String udid, String port, String systemPort) throws Exception {
//    //public void setUpClass() throws Exception {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//        drv.MultipleDriver(platformName, deviceName, platformVersion, udid, port, systemPort);
//    }
//
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass() throws Exception {
//        testNGCucumberRunner.finish();
//    }
//}
//
