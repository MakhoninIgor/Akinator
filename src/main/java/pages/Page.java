package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    public WebDriver driver;

    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public WebElement findElement(By by, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return driver.findElement(by);
    }

    public static void waitForLoad(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until((ExpectedCondition<Boolean>) d -> ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete"));
    }

    public static void waitUntilLoaderDisappeared(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        WebElement loader = driver.findElement(locator);
        wait.until(ExpectedConditions.invisibilityOf(loader));
    }
}

    /*public static void waitUntilElementGetClickable(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        WebElement button = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(button));
    }*/
