package StepDefinitions;

import Pages.DialogContent01;
import Pages.LeftNav01;
import Utilities.GWD01;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _US05_RemovingItemsFromTheShoppingCart {
    DialogContent01 dc = new DialogContent01();
    LeftNav01 ln = new LeftNav01();
    WebDriverWait wait = new WebDriverWait(GWD01.getDriver(), Duration.ofSeconds(10));

    static int count;

    @Then("Cart Success Message Should Appear")
    public void loginSuccessMessageShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.arcVerify));
        Assert.assertTrue(dc.arcVerify.isDisplayed());
        Assert.assertTrue(dc.arcVerify.getText().toLowerCase().contains("you added".toLowerCase()));
    }

    @And("Delete All Items from Cart")
    public void deleteAllItemsFromCart() {

        for (int i = 0; i < count; i++) {
            dc.myClick(dc.arcDelete);

            if (i < count - 1) {
                wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(dc.arcDelete)));
            }
        }
    }

    @And("Verify Quantity Updated")
    public void verifyQuantityUpdated(DataTable dtQty) {
        List<String> list = dtQty.asList(String.class);
        for (int i = 0; i < list.size(); i++) {
            wait.until(ExpectedConditions.visibilityOf(dc.arcCartQty));
            wait.until(ExpectedConditions.attributeToBeNotEmpty(dc.arcCartQty, "value"));
            Assert.assertEquals(dc.arcCartQty.getAttribute("value"), list.getFirst());
        }
        GWD01.getDriver().navigate().back();
    }

    @And("Verify Cart is Empty")
    public void verifyCartIsEmpty() {
        wait.until(ExpectedConditions.visibilityOf(dc.arcCartEmpty));
        Assert.assertTrue(dc.arcCartEmpty.getText().toLowerCase().contains("no items".toLowerCase()));
    }

    @Then("Check Product Count")
    public void checkProductCount() {
        wait.until(ExpectedConditions.visibilityOf(dc.arcStale));
        count = dc.arcCount.size();
        System.out.println("count = " + count);

    }
}
