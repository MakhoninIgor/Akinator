package browsers;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class OpenBrowser {

    public void manageDriver(WebDriver driver){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
