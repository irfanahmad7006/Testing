package ui;

import org.openqa.selenium.WebDriver;

public class Login {
    public static void main(String[] args) {
        Login login = new Login();
        login.login("https://www.youtube.com");


    }
    public void login(String url){
        Drivers drivers = new Drivers(" ");
        drivers.get("https://www.google.com");
        drivers.navOtherUrls("https://www.youtube.com");
        drivers.close();
        drivers.quit();
    }
}
