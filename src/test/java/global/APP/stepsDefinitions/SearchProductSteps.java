package global.APP.stepsDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import global.APP.pages.Intro;
import global.APP.pages.NavigationBar;
import global.Drivers;
import member.APP.pages.Account;
import member.APP.pages.Login;
import member.APP.pages.SearchProduct;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class SearchProductSteps {

    Drivers driver = new Drivers();
//    Intro intro = new Intro(driver.getDriver());
//    NavigationBar navBar = new NavigationBar(driver.getDriver());
//    Account account = new Account(driver.getDriver());
//    Login login = new Login(driver.getDriver());
    SearchProduct searchPro = new SearchProduct(driver.getDriver());

    @Given("^I Search for \"([^\"]*)\" Product$")
    public void iSearchForDSLRProduct(String productName) throws InterruptedException {
        searchPro.searchProduct(productName);
    }

    @And("^I tap on search button$")
    public void iTapOnSearchButton() {
    }

    @Then("^I should Search result$")
    public void iShouldSearchResult() {
    }
}
