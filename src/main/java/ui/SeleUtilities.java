package ui;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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

    public void impilicitWait (WebDriver driver,int timeUnit) {
        try {
            driver.manage().timeouts().implicitlyWait(timeUnit, TimeUnit.SECONDS);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void waitUntilVisible(WebDriver driver,String xpath){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public void userWaits(int timeStamp){
        try {
            Thread.sleep(timeStamp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void takeScrnShot (WebDriver driver) throws IOException {
        TakesScreenshot takesScreenshot = ((TakesScreenshot)driver); // Creating instance

        File file = takesScreenshot.getScreenshotAs(OutputType.FILE); // Taking screen shot

        String location = "C:\\Users\\irfan\\IdeaProjects\\Testing\\src\\main\\resources\\screenshots\\";
        String fileType = ".png";
        /*Using to date&time to make file name unique*/
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
        Date date = new Date();

        String fullFileNameWithLoc = location+dateFormat.format(date)+fileType;

        File screenShot = new File(fullFileNameWithLoc);
        FileUtils.copyFile(file,screenShot);
    }


}
