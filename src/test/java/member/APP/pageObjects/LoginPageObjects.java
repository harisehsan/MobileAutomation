package member.APP.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPageObjects {

    @AndroidFindBy(id = "com.lazada.android:id/btn_login_fresh_welcome_login")
    public MobileElement loginOption;

    @AndroidFindBy(id = "com.lazada.android:id/et_laz_form_input_field_edit")
    @iOSFindBy(xpath = "//*[@class='UIATextField']")
    public MobileElement emailImp;

    @AndroidFindBy(id = "com.lazada.android:id/et_laz_form_password_field_edit")
    @iOSFindBy(xpath = "((//*[@class='UIAView' and ./parent::*[@class='UIAScrollView']]/*[@class='UIAView'])[2]/*[@class='UIAView'])[2]")
    public MobileElement passwordImp;

    @AndroidFindBy(id = "com.lazada.android:id/btn_login_form_account_login")
    @iOSFindBy(xpath = "//*[@text='Login']")
    public MobileElement loginBtn;
}
//*[@class='UIAView']
//*[@class='UIATextField']
//*[@XCElementType='XCUIElementTypeTextField']

/*

    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("LATabController_AccountButton");
el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("LOGIN / SIGNUP");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Lazada\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
        el3.sendKeys("email");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Lazada\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField");
        el4.sendKeys("123");
        MobileElement el5 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Lazada\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
        el5.clear();

*/