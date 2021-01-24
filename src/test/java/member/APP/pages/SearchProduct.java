package member.APP.pages;

import global.Base;
import global.Drivers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import member.APP.pageObjects.SearchPageObject;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct extends Base {
    SearchPageObject searchPageObj = new SearchPageObject();



    public SearchProduct(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), searchPageObj);
    }

    public void searchProduct(String productName) throws InterruptedException {

        waitUntilPresentOfElementBy(searchPageObj.searchBeforeClick_txtfield_By);
        searchPageObj.searchBeforeClick_txtfield.click();
        waitUntilPresentOfElementBy(searchPageObj.searchAfterClick_txtfield_By);
        searchPageObj.searchAfterClick_txtfield.sendKeys(productName);
    }
}
