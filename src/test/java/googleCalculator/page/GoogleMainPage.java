package googleCalculator.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

/**
 * Created by Iryna on 07.10.2015.
 */

public class GoogleMainPage extends PageObject {

    @FindBy(name="q")
    WebElement fieldGoogleSearch;
    @FindBy(name = "btnG")
    WebElement buttonGoogleSearch;


    public void inputInSearchBar(String text) {
        if (fieldGoogleSearch.isDisplayed()) {
            fieldGoogleSearch.clear();
            fieldGoogleSearch.sendKeys(text, Keys.ENTER);
            //if (buttonSearchGo.isDisplayed()) {
           //     buttonSearchGo.click();
           // }
        }else{
            System.out.print("Not find element fieldGoogleSearch");
        }
    }

    public void searchInfo() {
        if (buttonGoogleSearch.isDisplayed()) {
            buttonGoogleSearch.click();
        }else{
            System.out.println("Not find element:buttonGoogleSearch");
        }
    }

    public void openPage() {

        getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        getDriver().manage().window().maximize();
        getDriver().get("https://google.com");

    }

    public void closeBrowser() {
        getDriver().close();
    }
    public void quitBrowser() {
        getDriver().quit();
    }

    public String trueGooglePage() {
        String title = getDriver().getTitle();
        return title;
    }
}
