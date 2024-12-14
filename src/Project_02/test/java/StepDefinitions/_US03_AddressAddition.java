package StepDefinitions;

import Pages.DialogContent01;
import Pages.LeftNav01;
import Utilities.GWD01;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _US03_AddressAddition {
    DialogContent01 dc = new DialogContent01();
    LeftNav01 ln = new LeftNav01();
    WebDriverWait wait = new WebDriverWait(GWD01.getDriver(), Duration.ofSeconds(10));

    @Then("User select state")
    public void userSelectState() {
        wait.until(ExpectedConditions.visibilityOf(dc.regionIdInput));
        Select select = new Select(dc.regionIdInput);
        select.selectByValue("18");

    }

    @Then("User should verify deletion message")
    public void userShouldVerifyDeletionMessage() {
        wait.until(ExpectedConditions.visibilityOf(dc.messageText));
        Assert.assertTrue(dc.messageText.getText().toLowerCase().contains("deleted ".toLowerCase()), "Delete hatalıdır");
    }

    @Then("My account button should be displayed")
    public void myAccountButtonShouldBeDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(dc.myAccountButton));
    }
}

