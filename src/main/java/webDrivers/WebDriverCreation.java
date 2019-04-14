package webDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverCreation {
    private static WebDriver driver;

    public void googleChrome(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver(options);
    }
    public void fireFoxBrowser(){

    }
    public void operaBrowser(){

    }
    public void microsoftEdge(){

    }
    public  WebDriver getDriver() {
        return driver;
    }
}
