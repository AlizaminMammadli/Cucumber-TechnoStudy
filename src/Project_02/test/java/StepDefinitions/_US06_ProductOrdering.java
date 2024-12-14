package StepDefinitions;

import Pages.DialogContent01;
import Utilities.GWD01;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;


public class _US06_ProductOrdering {
    DialogContent01 dc = new DialogContent01();
    Actions actions = new Actions(GWD01.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) GWD01.getDriver();
    WebDriverWait wait = new WebDriverWait(GWD01.getDriver(), Duration.ofSeconds(5));

    @And("Shopping transaction in Dialog")
    public void shoppingTransactionInDialog() {
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", dc.fusionBackpack);
        actions.moveToElement(dc.fusionBackpack).build().perform();
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", dc.addToCart);
        wait.until(ExpectedConditions.visibilityOf(dc.addToCart));
        js.executeScript("arguments[0].click();", dc.addToCart);
        wait.until(ExpectedConditions.visibilityOf(dc.counterNumber));
        wait.until(ExpectedConditions.elementToBeClickable(dc.basket));
        js.executeScript("arguments[0].click();", dc.basket);

        wait.until(ExpectedConditions.visibilityOf(dc.proceedToCheckout));
        dc.myClick(dc.proceedToCheckout);
    }

    @Then("Purchase Success Message Should Appear")
    public void purchaseSuccessMessageShouldAppear() {
        wait.until(ExpectedConditions.visibilityOf(dc.placeOrder));
        js.executeScript("arguments[0].click();", dc.placeOrder);
        wait.until(ExpectedConditions.urlContains("success"));
        Assert.assertTrue(GWD01.getDriver().getCurrentUrl().toLowerCase().contains("success".toLowerCase()));

    }
}
