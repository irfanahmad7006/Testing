package ui;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class Login extends Drivers {
    WebDriver driver= setChromeDriver();

    @Given("User navigates to {string}")
    public void user_navigate_to(String string) {
        navOtherUrls(string);
    }
}
