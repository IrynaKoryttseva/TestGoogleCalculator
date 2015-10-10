package googleCalculator.steps;

import googleCalculator.page.GoogleCalculatorPage;
import googleCalculator.page.GoogleMainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Iryna on 09.10.2015.
 */
public class UsersSteps extends ScenarioSteps{
    GoogleMainPage googleMainPage;
    GoogleCalculatorPage googleCalculatorPage;

    @Step
    public void openMainGooglePage(){
        googleMainPage.openPage();

    }
    @Step
    public String checkTitlePage(){
        return googleMainPage.trueGooglePage();
    }
    @Step
    public void openCalculatorGooglePage(){
        googleMainPage.inputInSearchBar("5+5");
        googleMainPage.searchInfo();
       // googleCalculatorPage.contentOnPage();
        googleCalculatorPage.trueGoogleCalculatorPage();
    }
    @Step
    public void checkWorkButtonCalculator(){
        googleCalculatorPage.clickFunctionAc();
        googleCalculatorPage.clickButtonZero();
        googleCalculatorPage.clickButtonPoint();
        googleCalculatorPage.clickButtonOne();
        googleCalculatorPage.clickButtonTwo();
        googleCalculatorPage.clickButtonThree();
        googleCalculatorPage.clickButtonFour();
        googleCalculatorPage.clickButtonFive();
        googleCalculatorPage.clickButtonSix();
        googleCalculatorPage.clickButtonSeven();
        googleCalculatorPage.clickButtonEight();
        googleCalculatorPage.clickButtonNine();
        googleCalculatorPage.clickFunctionEqual();
      //  String actualResult = googleCalculatorPage.checkContentFieldAction();
      //  assertThat(actualResult, is("0.123456789 ="));
      //  googleCalculatorPage.clickFunctionAc();
    }
    @Step
    public void inputOperand(String operand){

        googleCalculatorPage.fieldInputDate.sendKeys(operand);
    }
    @Step
    public void checkFunctionAdd(){
        googleCalculatorPage.clickFunctionAdd();
    }
    public void quitBrowser(){
      googleMainPage.quitBrowser();
    }
    @Step
    public void checkFunctionSubtract(){
        googleCalculatorPage.clickFunctionSubtract();
    }
    @Step
    public void checkFunctionMultiply(){
        googleCalculatorPage.clickFunctionMultiply();
    }
    @Step
    public void checkFunctionDivide(){
        googleCalculatorPage.clickFunctionDivide();
    }
    @Step
    public void clickAc(){
        googleCalculatorPage.clickFunctionAc();
    }
    @Step
    public void checkFunctionEqual(){
        googleCalculatorPage.clickFunctionEqual();
    }
    @Step
    public String returnActualResult(){
        return googleCalculatorPage.resultFunctionCalculator();
    }
}
