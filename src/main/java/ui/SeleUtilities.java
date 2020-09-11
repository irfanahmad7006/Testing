package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleUtilities {

    public static void navigateMethod(WebDriver driver, String url) {
        driver.navigate().to(url);
    }

    public static void closeMethod(WebDriver driver) {
        driver.close();
    }

    public static void quitMethod(WebDriver driver) {
        driver.quit();
    }

    public void sendKeys(WebDriver driver, String xpath, String value) {
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }

    public void click(WebDriver driver, String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public boolean isVisible(WebDriver driver, String xpath) {
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean isSelected(WebDriver driver, String xpath) {
        return driver.findElement(By.xpath(xpath)).isSelected();
    }

    public boolean isEnabled(WebDriver driver, String xpath) {
        return driver.findElement(By.xpath(xpath)).isEnabled();
    }
}
