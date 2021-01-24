package member.APP.pages;

import global.APP.pageObjects.IntroPageObjects;
import global.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import member.APP.pageObjects.AccountPageObjects;
import org.openqa.selenium.support.PageFactory;

public class Account extends Base {

    AccountPageObjects accountObj = new AccountPageObjects();

    public Account(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), accountObj);
    }

    public void gotoPreLoginPage(){
        accountObj.loginOrRegistrationBtn.click();
    }
}
