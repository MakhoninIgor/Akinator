package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AkinatorPage extends Page {

    boolean flag1 = true;
    boolean flag2 = true;
    //boolean flag3 = true;

    private static String url = "https://ru.akinator.com/";
    By start = By.xpath("//*[@class = 'btn-play']");
    By yes = By.id("a_yes");
    By no = By.id("a_no");
    By dontKnow = By.id("a_dont_know");
    By probably = By.id("a_probably");
    By probalyNot = By.id("a_probaly_not");
    By question = By.xpath("//*[@class = 'bubble-body']");

    By propose = By.xpath("//*[@class='sub-bubble-propose']");

    By proposeTitle = By.xpath("//*[@class = 'proposal-title']");
    By proposeSubtitle = By.xpath("//*[@class = 'proposal-subtitle']");

    By proposeYes = By.xpath("//*[@id = 'a_propose_yes']");
    By proposeNo = By.xpath("//*[@id = 'a_propose_no']");

    By loader =By.xpath("//*[@id=\"div-overlay\"]/img");

    By win = By.xpath("//*[@id=\"game_content\"]/div/div[3]/div[1]/p");

    //By winSentence = By.xpath("//*[@class = 'win-sentence']");
    //By winTitle = By.xpath("//*[@class = 'win-title']");
    //By winSubtitle = By.xpath("//*[@class = 'win-subtitle']");
    //By winSubtitleLastPlayed = By.xpath("//*[@class = 'win-subtitle last-played']");
    //By proposeTitle = By.xpath("//*[@class = 'proposal-title']");

    //By subBublePropose = By.xpath("//*[@class = 'sub-bubble-propose']");

    //By proposalTitle = By.xpath("//*[@class = 'proposal-title']");

    //By aContinueYes = By.xpath("//*[@id = 'a_continue_yes']");
    //By aContinueNo = By.xpath("//*[@id = 'a_continue_no']");

    public AkinatorPage(WebDriver driver) {
        super(driver);
    }

    public void play() {
        waitForLoad(driver);
        findElement(start, 5).click();
    }
    public void choose() {
        waitForLoad(driver);
        while (flag1) {
            print(findElement(question, 5).getText());
            print("1 " + findElement(yes, 5).getText());
            print("2 " + findElement(no, 5).getText());
            print("3 " + findElement(dontKnow, 5).getText());
            print("4 " + findElement(probably, 5).getText());
            print("5 " + findElement(probalyNot, 5).getText());
            print("Ответ:");
            int[] a = {1, 2, 3, 4, 5};
            int k = (int) (Math.random() * a.length);
            switch (a[k]) {
                case 1: {
                    System.out.println(a[k]);
                    findElement(yes, 5).click();
                }
                break;
                case 2: {
                    System.out.println(a[k]);
                    findElement(no, 5).click();
                }
                break;
                case 3: {
                    System.out.println(a[k]);
                    findElement(dontKnow, 5).click();
                }
                break;
                case 4: {
                    System.out.println(a[k]);
                    findElement(probably, 5).click();
                }
                break;
                case 5: {
                    System.out.println(a[k]);
                    findElement(probalyNot, 5).click();
                }
                break;
            }
            waitUntilLoaderDisappeared(driver,loader);
            if (driver.findElements(question).size() ==0){
                flag1 = false;

            }else{
                flag1 = true;
            }
        }
    }
    public void winGame() {
        while(flag2){
            print(findElement(propose,5).getText());
            print(findElement(proposeTitle,5).getText());
            print(findElement(proposeSubtitle,5).getText());
            print("Ответ:");
            int[] a = {1, 1};
            int k = (int) (Math.random() * a.length);
            switch (a[k]) {
                case 1: {
                    System.out.println("Да");
                    findElement(proposeYes, 5).click();
                    flag2 = false;
                }break;
                case 2: {
                    System.out.println("Нет");
                    findElement(proposeNo, 5).click();
                }break;
            }
            waitUntilLoaderDisappeared(driver,loader);
        }
    }
    public void endGame(){
        print(findElement(win,5).getText());
    }
    /*public void startAgain(){
        waitForLoad(driver);
        waitUntilElementGetClickable(driver,aContinueYes);
        waitUntilElementGetClickable(driver,aContinueNo);
        while(flag3){
            print(findElement(proposalTitle, 5).getText());
            print("Ответ:");
            int[] a = {1, 1};
            int k = (int) (Math.random() * a.length);
            switch (a[k]) {
                case 1: {
                    System.out.println("Да");
                    findElement(aContinueYes, 5).click();
                    flag1 = true;
                }
                break;
                case 2: {
                    System.out.println("Нет");
                    findElement(aContinueNo, 5).click();
                    //flag3 = false;
                }
                break;
            }
            waitUntilLoaderDisappeared(driver,loader);
            if (driver.findElements(subBublePropose).size() ==0){
                flag3 = false;

            }else{
                flag3 = true;
            }
        }
    }*/
    public static String getUrl(){
        return url;
    }

}
