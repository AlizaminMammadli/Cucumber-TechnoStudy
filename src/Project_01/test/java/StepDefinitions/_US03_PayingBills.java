package StepDefinitions;


import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _US03_PayingBills {
    DialogContent dc = new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    @Then("Bill Payment Message Should be Displayed")
    public void billPaymentMessageShouldBeDisplayed(DataTable dtMessage) {
        List<String> listMessages = dtMessage.asList(String.class);
        for (int i = 0; i < listMessages.size(); i++) {
            verifyBillMessageContainsText(listMessages.get(i));
        }
    }

    public void verifyBillMessageContainsText(String value) {
        wait.until(ExpectedConditions.visibilityOf(dc.billPayment));
        Assert.assertTrue(dc.billPayment.getText().toLowerCase().contains(value.toLowerCase()));

    }

    @Then("Amount Message Should be Displayed")
    public void amountMessageShouldBeDisplayed(DataTable dtMessage) {
        List<String> listMessages = dtMessage.asList(String.class);
        for (int i = 0; i < listMessages.size(); i++) {
            verifyMessageContainsText(listMessages.get(i));
        }
    }
    public void verifyMessageContainsText( String value) {
        wait.until(ExpectedConditions.visibilityOf(dc.billPaymentAmount));
        Assert.assertTrue(dc.billPaymentAmount.getText().toLowerCase().contains(value.toLowerCase()));
    }
}
