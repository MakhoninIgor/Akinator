package rule;

import browsers.CloseBrowser;
import browsers.OpenBrowser;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import pages.AkinatorPage;
import webDrivers.WebDriverCreation;

public class MyRule extends TestWatcher {

    private static WebDriver driver;
    WebDriverCreation create = new WebDriverCreation();
    OpenBrowser open = new OpenBrowser();
    CloseBrowser close = new CloseBrowser();

    @Override
    public void starting(Description description) {
        create.googleChrome();
        driver = create.getDriver();
        open.manageDriver(driver);
        driver.get(AkinatorPage.getUrl());
    }
    @Override
    public void finished(Description description) {

        close.closeBrowser(driver);
    }
}
