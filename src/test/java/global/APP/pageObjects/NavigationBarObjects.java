package global.APP.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NavigationBarObjects {

    @AndroidFindBy(xpath = "//android.widget.TabWidget[@resource-id=\"android:id/tabs\"]/android.widget.FrameLayout")
    @iOSFindBy(className = "//*[@class='UIATabBar']")
    public List<WebElement> navigationBar;

    @AndroidFindBy(xpath = "//android.widget.TabWidget[@resource-id=\"android:id/tabs\"]/android.widget.FrameLayout[1]")
    @iOSFindBy(xpath = "//*[@name='LATabController_HomeButton']")
    public MobileElement homeTab;

    @AndroidFindBy(xpath = "//android.widget.TabWidget[@resource-id=\"android:id/tabs\"]/android.widget.FrameLayout[2]")
    @iOSFindBy(xpath = "//*[@name='LATabController_StoreStreetButton']")
    public MobileElement feedTab;

    @AndroidFindBy(xpath = "//android.widget.TabWidget[@resource-id=\"android:id/tabs\"]/android.widget.FrameLayout[3]")
    @iOSFindBy(xpath = "//*[@name='LATabController_MessagesButton']")
    public MobileElement messagesTab;

    @AndroidFindBy(xpath = "//android.widget.TabWidget[@resource-id=\"android:id/tabs\"]/android.widget.FrameLayout[4]")
    @iOSFindBy(xpath = "//*[@name='LATabController_CartButton']")
    public MobileElement cartTab;

    @AndroidFindBy(xpath = "//android.widget.TabWidget[@resource-id=\"android:id/tabs\"]/android.widget.FrameLayout[5]")
    @iOSFindBy(xpath = "//*[@name='LATabController_AccountButton']")
    //@iOSFindBy(xpath = "//*[@id='LATabController_AccountButton']")
    //@iOSFindBy(id = "LATabController_AccountButton")
    public MobileElement accountTab;

}
