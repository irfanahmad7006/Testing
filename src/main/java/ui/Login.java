package ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Login extends SeleUtilities {
    private WebDriver driver;
    private ConfigRead configRead;

    @Given("User sets the driver for {string} browser")
    public void user_sets_the_driver_for_browser(String string) {
        driver = Drivers.setBrowser(string);
    }

    @Given("User navigates to {string}")
    public void user_navigate_to(String string) {
        navigateMethod(driver, string);
    }

    @Then("User closes the browser")
    public void user_closes_the_browser() {
//        closeMethod(driver);
        quitMethod(driver);
    }

    @Given("user sets browser and go to url")
    public void user_sets_browser_and_go_to_url() {
        configRead = new ConfigRead();
        String browser = configRead.getBrowser();
        String url = configRead.getUrl();
        driver = Drivers.setBrowser(browser);
        navigateMethod(driver, url);
    }

    @Then("User clicks on given element {string};")
    public void user_clicks_on_given_element(String string) {
        impilicitWait(driver, 10000);
        waitUntilVisible(driver,string);
        click(driver, string);
    }

    @Then("User enters user id and password")
    public void user_enters_user_id_and_password() {
//        impilicitWait(driver, 10000);

        configRead = new ConfigRead();
        String userID = configRead.getUserName("userName");
        String password = configRead.getPassword("password");
        String userNameXpath = "//input[@id='login1']";
        String passwordXpath = "//input[@id='password']";
        waitUntilVisible(driver,userNameXpath);
        waitUntilVisible(driver,passwordXpath);
        sendKeys(driver, userNameXpath, userID);
        sendKeys(driver, passwordXpath, password);
    }
}
