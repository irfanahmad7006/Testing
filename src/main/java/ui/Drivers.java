package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Drivers {

    //    WebDriver Drivers(String browserName){
//        if (browserName == "chrome"){
//            return setChromeDriver();
//        }else{
//            return setFireFoxDriver();
//        }
//    }
    public static WebDriver setBrowser(String browserName) {
        if (browserName.equals("chrome")) {
            return setChromeDriver();
        } else {
            return setFireFoxDriver();
        }
    }

    static String userDirectory = System.getProperty("user.dir");

    public static WebDriver setChromeDriver() {
//        String path = "C:\\Users\\Irfan_PC\\Documents\\GitHub\\Testing\\src\\main\\resources\\drivers\\chromedriver.exe";
        String path = userDirectory+"/src/main/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver setFireFoxDriver() {
//        String path = "C:\\Users\\Irfan_PC\\Documents\\GitHub\\Testing\\src\\main\\resources\\drivers\\geckodriver.exe";
        String path = userDirectory+"/src/main/resources/drivers/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);
        return driver;
    }
}
