package global.APP.pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

public class IntroPageObjects {

    @AndroidFindBy(id = "com.lazada.android:id/intro_skip_btn")
    @iOSFindBy(xpath = "//*[@id='xxxx']")
    public MobileElement skipBtn;

}
