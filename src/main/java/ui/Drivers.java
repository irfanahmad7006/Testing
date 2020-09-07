package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Drivers {
    private String browserName;
    Drivers(String browserName){
        if (browserName == "chrome"){
            setChromeDriver();
        }else{
            setFireFoxDriver();
        }
    }
    public static WebDriver setChromeDriver(){
        String path = "C:\\Users\\Irfan_PC\\Documents\\GitHub\\Testing\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    public static WebDriver setFireFoxDriver(){
        String path = "C:\\Users\\Irfan_PC\\Documents\\GitHub\\Testing\\drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",path);
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette",true);
        WebDriver driver = new FirefoxDriver(capabilities);
        return driver;
    }

    public void get(String s) {
        setFireFoxDriver().get(s);
    }
    public void close(){
        setFireFoxDriver().close();
    }
    public void quit(){
        setFireFoxDriver().quit();
    }
    public void navOtherUrls(String url){
        setFireFoxDriver().navigate().to(url);
    }
}
