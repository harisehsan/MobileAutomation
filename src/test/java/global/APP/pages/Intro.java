package global.APP.pages;

import global.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import global.APP.pageObjects.IntroPageObjects;
import org.openqa.selenium.support.PageFactory;


public class Intro extends Base {

    IntroPageObjects introObj = new IntroPageObjects();

    public Intro(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), introObj);
    }

    public void skipIntro(){
        if (isAndroid())
            if(introObj.skipBtn.isEnabled())
                introObj.skipBtn.click();
    }


}
