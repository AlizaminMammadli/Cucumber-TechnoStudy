package StepDefinitions;


import Pages.DialogContent01;
import Utilities.GWD01;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _US03_PayingBills {
    DialogContent01 dc = new DialogContent01();
    WebDriverWait wait = new WebDriverWait(GWD01.getDriver(), Duration.ofSeconds(10));

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
