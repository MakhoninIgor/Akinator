import org.junit.Rule;
import org.junit.Test;
import pages.AkinatorPage;
import rule.MyRule;
import webDrivers.WebDriverCreation;

public class AkinatorTest {

    AkinatorPage ap;

    @Rule
    public MyRule myRule = new MyRule();

    @Test
    public void playTest() {
        ap = new AkinatorPage(new WebDriverCreation().getDriver());
        ap.play();
        ap.choose();
        ap.winGame();
        ap.endGame();

    }
}
