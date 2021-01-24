package global.APP.pages;

import global.APP.pageObjects.NavigationBarObjects;
import global.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar extends Base {

    NavigationBarObjects navObj = new NavigationBarObjects();

    public NavigationBar (AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), navObj);
    }

    public void gotoHomePage(){
        //waitNavBar();
        navObj.homeTab.click();
    }

    public void gotoFeedPage(){
        //waitNavBar();
        navObj.feedTab.click();
    }

    public void gotoMessagePage(){
        //waitNavBar();
        navObj.messagesTab.click();
    }

    public void gotoCardPage(){
        //waitNavBar();
        navObj.cartTab.click();
    }

    public void gotoMemberPage(){
        //waitNavBar();
        navObj.accountTab.click();
    }
}
