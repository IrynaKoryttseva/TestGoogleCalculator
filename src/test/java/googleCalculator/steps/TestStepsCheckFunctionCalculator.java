package googleCalculator.steps;

import net.serenitybdd.jbehave.SerenityStory;
import net.thucydides.core.annotations.Steps;
import org.codehaus.groovy.runtime.powerassert.SourceText;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Iryna on 07.10.2015.
 */
public class TestStepsCheckFunctionCalculator extends SerenityStory{

    @Steps
    UsersSteps usersSteps;

    @Given("open Google Chrome browser,go to Google main page")
    public void openGoogleChromeBrowser() {
        usersSteps.openMainGooglePage();
    }

    @Given("User go to Google calculator page")
    public void openGoogleMainPage() {
        usersSteps.openCalculatorGooglePage();
    }

    @When("I do something")
    public void iDoSomething(){
        System.out.println("Step two");}

    @When("User click buttons in the Google calculator")
    public void toCheckButtonWorks(){
        usersSteps.checkWorkButtonCalculator();
    }

    @When("User prepare $operand1 and $operand2 in the Google calculator ADD")
    public void inputDataIntoCalculatorAdd(@Named("$operand1") String operand1, @Named("$operand2") String operand2){
        usersSteps.clickAc();
        usersSteps.inputOperand(operand1);
        usersSteps.checkFunctionAdd();
        usersSteps.inputOperand(operand2);
        usersSteps.checkFunctionEqual();
        usersSteps.returnActualResult();
    }
    @When("User prepare $operand1 and $operand2 in the Google calculator SUBTRACT")
    public void inputDataIntoCalculatorSubtract(@Named("$operand1") String operand1, @Named("$operand2")
    String operand2){
        usersSteps.clickAc();
        usersSteps.inputOperand(operand1);
        usersSteps.checkFunctionSubtract();
        usersSteps.inputOperand(operand2);
        usersSteps.checkFunctionEqual();
        usersSteps.returnActualResult();
    }
    @When("User prepare $operand1 and $operand2 in the Google calculator MULTIPLY")
    public void inputDataIntoCalculatorMultiply(@Named("$operand1") String operand1, @Named("$operand2")
    String operand2){
        usersSteps.clickAc();
        usersSteps.inputOperand(operand1);
        usersSteps.checkFunctionMultiply();
        usersSteps.inputOperand(operand2);
        usersSteps.checkFunctionEqual();
        usersSteps.returnActualResult();
    }
    @When("User prepare $operand1 and $operand2 in the Google calculator DIVIDE")
    public void inputDataIntoCalculatorDivide(@Named("$operand1") String operand1, @Named("$operand2")
    String operand2){
        usersSteps.clickAc();
        usersSteps.inputOperand(operand1);
        usersSteps.checkFunctionDivide();
        usersSteps.inputOperand(operand2);
        usersSteps.checkFunctionEqual();
        usersSteps.returnActualResult();
    }
    @Then("User check title page")
    public void checkTitlePage(){
        String title=usersSteps.checkTitlePage();
        try {
            assertTrue(title.equals("Google"));
            usersSteps.quitBrowser();
        }catch (Exception io) {
            io.printStackTrace();
            usersSteps.quitBrowser();
        }
    }

    @Then("Google calculator achieved $expectedResult")
    public void checkWorksButtonsCalculatorResult(@Named("$expectedResult") String expectedResult) {
        String actualResultButtonWorks = usersSteps.returnActualResult();
        System.out.println("!!!!!!!!!!!!!"+actualResultButtonWorks);
        System.out.println("************"+expectedResult);
        try {
            assertTrue(actualResultButtonWorks.equals(expectedResult));
            usersSteps.quitBrowser();
        } catch (Exception io) {
            io.printStackTrace();
            usersSteps.quitBrowser();
        }
    }

    @Then("Google calculator1 achieved $addExpectedResult")
    public void calculatorAchievedAddResult(@Named("$addExpectedResult") String addExpectedResult) {
        String addActualResult = usersSteps.returnActualResult();
        System.out.println("!!!!!!!!!!!!!"+addActualResult);
        System.out.println("************"+addExpectedResult);
        try {
            assertTrue(addActualResult.equals(addExpectedResult));
            usersSteps.quitBrowser();
        } catch (Exception io) {
            io.printStackTrace();
            usersSteps.quitBrowser();
        }
    }
    @Then("Google calculator2 achieved $subtractExpectedResult")
    public void calculatorAchievedSubtractResult(@Named ("$subtractExpectedResult")
    String subtractExpectedResult){
        String subtractActualResult = usersSteps.returnActualResult();
        System.out.println("!!!!!!!!!!!!!"+subtractActualResult);
        System.out.println("************"+subtractExpectedResult);
        try {
            assertTrue(subtractActualResult.equals(subtractExpectedResult));
            usersSteps.quitBrowser();
        } catch (Exception io) {
            io.printStackTrace();
            usersSteps.quitBrowser();
        }
    }
    @Then("Google calculator3 achieved $multiplyExpectedResult")
    public void calculatorAchievedMultiplyResult(@Named ("$multiplyExpectedResult")
    String multiplyExpectedResult){
        String multiplyActualResult = usersSteps.returnActualResult();
        System.out.println("!!!!!!!!!!!!!"+multiplyActualResult);
        System.out.println("************"+multiplyExpectedResult);
        try {
            assertTrue(multiplyActualResult.equals(multiplyExpectedResult));
            usersSteps.quitBrowser();
        } catch (Exception io) {
            io.printStackTrace();
            usersSteps.quitBrowser();
        }
    }
    @Then("Google calculator4 achieved $divideExpectedResult")
    public void calculatorAchievedDivideResult(@Named ("$divideExpectedResult")
    String divideExpectedResult){
        String divideActualResult = usersSteps.returnActualResult();
        System.out.println("!!!!!!!!!!!!!"+divideActualResult);
        System.out.println("************"+divideExpectedResult);
        try {
            assertTrue(divideActualResult.equals(divideExpectedResult));
            usersSteps.quitBrowser();
        } catch (Exception io) {
            io.printStackTrace();
            usersSteps.quitBrowser();
        }
    }
  }
