package member.APP.pages;

import global.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import member.APP.pageObjects.LoginPageObjects;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {

    LoginPageObjects loginObj = new LoginPageObjects();

    public Login(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), loginObj);
    }

    public void gotoLoginPage(){
        loginObj.loginOption.click();
    }

    public void loginProcess(String user, String pass){
        if (isAndroid())
            loginObj.loginOption.click();
        loginObj.emailImp.sendKeys(user);
        hideKeyboard();
        loginObj.passwordImp.sendKeys(pass);
        hideKeyboard();
        loginObj.loginBtn.click();

    }

}
