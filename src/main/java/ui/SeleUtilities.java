package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleUtilities {
    WebDriver driver;
    SeleUtilities(WebDriver driver){
        this.driver = driver;
    }

    public void sendkeys(String xpath,String value){
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }
    public void click(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    public boolean isVisible(String xpath){
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }
    public boolean isSelected(String xpath){
        return driver.findElement(By.xpath(xpath)).isSelected();
    }
    public boolean isEnabled(String xpath){
        return driver.findElement(By.xpath(xpath)).isEnabled();
    }
}
