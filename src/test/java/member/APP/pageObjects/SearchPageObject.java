package member.APP.pageObjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPageObject {
    @AndroidFindBy (id= "com.daraz.android:id/laz_homepage_search_view") public WebElement searchBeforeClick_txtfield;
    @AndroidFindBy (id = "com.daraz.android:id/search_input_box") public WebElement searchAfterClick_txtfield;

    public By searchBeforeClick_txtfield_By = By.id("com.daraz.android:id/laz_homepage_search_view");
    public By searchAfterClick_txtfield_By = By.id("com.daraz.android:id/search_input_box");
}
