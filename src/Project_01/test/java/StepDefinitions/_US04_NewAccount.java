package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;


public class _US04_NewAccount {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(15));


    @Then("Minimum Account Message Should be Displayed")
    public void minimumAccountMessageShouldBeDisplayed(DataTable dtMessage) {
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dc.accountBalanceDdown,"value"));
        List<String> listMessages = dtMessage.asList(String.class);
        for (int i = 0; i < listMessages.size(); i++) {
            verifyMessageContainsText(listMessages.get(i));
        }

    }
    public void verifyMessageContainsText( String value) {
        wait.until(ExpectedConditions.visibilityOf(dc.minimumBalance));
        Assert.assertTrue(dc.minimumBalance.getText().toLowerCase().contains(value.toLowerCase()));
    }


    @Then("New Account Message Should be Displayed")
    public void newAccountMessageShouldBeDisplayed(DataTable dtMessage) {
        List<String> listMessages = dtMessage.asList(String.class);
        for (int i = 0; i < listMessages.size(); i++) {
            successAccountContainsText(listMessages.get(i));
        }
    }

    @When("Click on the Element New Account")
    public void clickOnTheElementNewAccount() throws AWTException {
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void successAccountContainsText( String value) {
        wait.until(ExpectedConditions.visibilityOf(dc.successNewAccount));
        Assert.assertTrue(dc.successNewAccount.getText().toLowerCase().contains(value.toLowerCase()));
    }
}
