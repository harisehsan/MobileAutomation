package global.APP.stepsDefinitions;

import cucumber.api.java.en.And;
import global.APP.pages.NavigationBar;
import global.Drivers;

public class GlobalElements {
    Drivers driver = new Drivers();
    NavigationBar navBar = new NavigationBar(driver.getDriver());

    @And("^go to Home")
    public void openHome() throws InterruptedException{
        navBar.gotoHomePage();
    }
    @And("^go to Feed")
    public void openFeed() throws InterruptedException{
        navBar.gotoFeedPage();
    }
    @And("^go to Message")
    public void openMessage() throws InterruptedException{
        navBar.gotoMessagePage();
    }
    @And("^go to Card")
    public void openCard() throws InterruptedException{
        navBar.gotoCardPage();
    }
    @And("^go to Member")
    public void open() throws InterruptedException{
        navBar.gotoMemberPage();
    }
}
