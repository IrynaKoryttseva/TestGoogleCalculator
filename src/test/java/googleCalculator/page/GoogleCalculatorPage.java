package googleCalculator.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertTrue;


/**
 * Created by Iryna on 07.10.2015.
 */
public class GoogleCalculatorPage extends PageObject {
   // WebDriver driver;
   // public GoogleCalculatorPage(WebDriver driver){
   //     this.driver=driver;
    //}
    @FindBy(xpath = "//div[1]//ol/div[1]/div[1]")
    WebElement calculatorGoogle;
    @FindBy(xpath = "//ol//div[5]/div[4]/div/span")
    WebElement buttonAdd;
    @FindBy(xpath = "//ol//div[4]/div[4]/div/span")
    WebElement buttonSubtract;
    @FindBy(xpath = "//ol//div[2]/div[4]/div/span")
    WebElement buttonDivide;
    @FindBy(xpath = "//ol//div[3]/div[4]/div/span")
    WebElement buttonMultiply;
    @FindBy(xpath = "//ol//div[1]/div[4]/div/span")
    WebElement buttonAc;
    @FindBy(xpath = "//ol//div[2]/div[5]/div[3]//span")
    WebElement buttonEqual;
    //numbers
    @FindBy(xpath = "//ol//div[2]/div[5]/div[1]//span")
    WebElement buttonZero;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[4]/div[1]//span")
    WebElement buttonOne;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[4]/div[2]//span")
    WebElement buttonTwo;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[4]/div[3]//span")
    WebElement buttonThree;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[3]/div[1]//span")
    WebElement buttonFour;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[3]/div[2]//span")
    WebElement buttonFive;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[3]/div[3]//span")
    WebElement buttonSix;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[2]/div[1]//span")
    WebElement buttonSeven;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[2]/div[2]//span")
    WebElement buttonEight;
    @FindBy(xpath = "//ol//div[3]/div[2]/div[2]/div[2]/div[3]//span")
    WebElement buttonNine;
    @FindBy(xpath = "//ol//div[2]/div[5]/div[2]//span")
    WebElement buttonPoint;
    @FindBy(xpath = "//ol//div[3]//div[2]/span")
    public WebElement fieldResultCalculator;
    @FindBy (xpath = "//*[@id=\"cwles\"]")
    WebElement fieldAction;
    @FindBy (xpath = "//*[@id=\"cwtltblr\"]")
    public WebElement fieldInputDate;

   // public void contentOnPage() {
    //    String pageTrue=getTitle();
    //    assertThat(pageTrue, is("5+5 - Поиск в Google"));
   // }
    public void trueGoogleCalculatorPage() {
      if(calculatorGoogle.isDisplayed()){
          System.out.println("Calculator is present");
      }else{System.out.println("Not find element: calculatorGoogle");}
    }
    public void clickFunctionAdd(){
        if(buttonAdd.isDisplayed()){
            buttonAdd.click();
        }else{
            System.out.println("Not find element:buttonAdd");
        }
    }
    public String checkContentFieldAction() {
        String actionField = null;
        if (fieldAction.isDisplayed()) {
            actionField=fieldAction.getText();
            System.out.println(actionField);
        }else{
            System.out.println("Not find element: fieldAction");
        }
        return actionField;

    }
    public void clickFunctionSubtract(){
        if(buttonSubtract.isDisplayed()){
            buttonSubtract.click();
        }else{
            System.out.println("Not find element: buttonSubtract");
        }
    }
    public void clickFunctionDivide(){
        if(buttonDivide.isDisplayed()){
            buttonDivide.click();
        }else{
            System.out.println("Not find element: buttonDivide");
        }
    }
    public void clickFunctionMultiply(){
        if(buttonMultiply.isDisplayed()){
            buttonMultiply.click();
        }else{
            System.out.println("Not find element: buttonMultiply");
        }
    }
    public void clickFunctionAc(){
        if(buttonAc.isDisplayed()){
            buttonAc.click();
        }else{
            System.out.println("Not find element: buttonAc");
        }
    }
    public void clickFunctionEqual(){
        if(buttonEqual.isDisplayed()){
            buttonEqual.click();
        }else{
            System.out.println("Not find element: buttonEqual");
        }
    }
    public void clickButtonZero(){
        if(buttonZero.isDisplayed()){
            buttonZero.click();
        }else{
            System.out.println("Not find element: buttonZero");
        }
    }
    public void clickButtonOne(){
        if(buttonOne.isDisplayed()){
            buttonOne.click();
        }else{
            System.out.println("Not find element: buttonOne");
        }
    }
    public void clickButtonTwo(){
        if(buttonTwo.isDisplayed()){
            buttonTwo.click();
        }else{
            System.out.println("Not find element: buttonTwo");
        }
    }
    public void clickButtonThree(){
        if(buttonThree.isDisplayed()){
            buttonThree.click();
        }else{
            System.out.println("Not find element: buttonThree");
        }
    }
    public void clickButtonFour(){
        if(buttonFour.isDisplayed()){
            buttonFour.click();
        }else{
            System.out.println("Not find element: buttonFour");
        }
    }
    public void clickButtonFive(){
        if(buttonFive.isDisplayed()){
            buttonFive.click();
        }else{
            System.out.println("Not find element: buttonFive");
        }
    }
    public void clickButtonSix(){
        if(buttonSix.isDisplayed()){
            buttonSix.click();
        }
    }
    public void clickButtonSeven(){
        if(buttonSeven.isDisplayed()){
            buttonSeven.click();
        }
    }
    public void clickButtonEight(){
        if(buttonEight.isDisplayed()){
            buttonEight.click();
        }
    }
    public void clickButtonNine(){
        if(buttonNine.isDisplayed()){
            buttonNine.click();
        }
    }
    public void clickButtonPoint(){
        if(buttonPoint.isDisplayed()){
            buttonPoint.click();
        }
    }
    public String resultFunctionCalculator() {
        String actualResult = "";
        if (fieldResultCalculator.isDisplayed()) {
            actualResult = fieldResultCalculator.getText();
        }

        return actualResult;
    }
}
