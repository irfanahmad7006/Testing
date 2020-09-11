package ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Login extends SeleUtilities {
    private WebDriver driver;

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
}
