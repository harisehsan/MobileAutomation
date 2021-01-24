package global.APP.stepsDefinitions;

import cucumber.api.java.en.Given;
import global.APP.pages.NavigationBar;
import global.Drivers;
import global.APP.pages.Intro;
import mainPage.APP.pages.HomePage;
import member.APP.pages.Account;
import member.APP.pages.Login;

import java.sql.Driver;


public class StartScreen {
    Drivers driver = new Drivers();

    Intro intro = new Intro(driver.getDriver());
    NavigationBar navBar = new NavigationBar(driver.getDriver());
    Account account = new Account(driver.getDriver());
    Login login = new Login(driver.getDriver());

    @Given("^open login app$")
    public void skipFirst() throws InterruptedException{
//        intro.skipIntro();
        navBar.gotoMemberPage();
        account.gotoPreLoginPage();
        login.loginProcess("right2_maresko@live.com","1416ybrbnf");
    }
    @Given("^open app")
    public void openApp() throws InterruptedException{
        intro.skipIntro();
    }
}
