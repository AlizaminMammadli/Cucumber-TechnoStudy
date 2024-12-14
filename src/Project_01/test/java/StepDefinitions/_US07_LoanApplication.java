package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _US07_LoanApplication {
    DialogContent dc = new DialogContent();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(15));

    @Then("Loan Approved message confirmation")
    public void userDeleteTheElementFromDialog() {
        wait.until(ExpectedConditions.visibilityOf(dc.statuMessage));
        Assert.assertTrue(dc.statuMessage.getText().toLowerCase().contains("Approved".toLowerCase()));

    }

    @Then("No Transaction message confirmation")
    public void noTransactionMessageConfirmation() {
    wait.until(ExpectedConditions.visibilityOf(dc.noTransaction));
    Assert.assertTrue(dc.noTransaction.getText().toLowerCase().contains("no".toLowerCase()));
    }

    @Then("Loan Denied message confirmation")
    public void loanDeniedMessageConfirmation() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.statuMessage));
        Assert.assertTrue(dc.statuMessage.getText().toLowerCase().contains("denied".toLowerCase()));
        wait.until(ExpectedConditions.visibilityOf(dc.deniedMessage));
        Assert.assertTrue(dc.deniedMessage.getText().toLowerCase().contains("do not have sufficient funds".toLowerCase()));
    }
}
