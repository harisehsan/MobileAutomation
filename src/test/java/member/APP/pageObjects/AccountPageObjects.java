package member.APP.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AccountPageObjects {

    @AndroidFindBy(id = "com.lazada.android:id/txt_login_signup")
    @iOSFindBy(xpath = "//*[@name='LOGIN / SIGNUP']")
    public MobileElement loginOrRegistrationBtn;
}
