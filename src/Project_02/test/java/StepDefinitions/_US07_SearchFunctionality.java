package StepDefinitions;

import Pages.DialogContent01;
import Utilities.GWD01;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _US07_SearchFunctionality {
    DialogContent01 dc = new DialogContent01();
    private final String skuNumber=dc.skuNumberText1.getText();
    Actions actions = new Actions(GWD01.getDriver());
    WebDriverWait wait = new WebDriverWait(GWD01.getDriver(), Duration.ofSeconds(5));


    @Then("Verify Jacket is Available")
    public void verifyJacketIsAvailable() {
        wait.until(ExpectedConditions.visibilityOf(dc.skuNumberText1));
        Assert.assertTrue(getSkuNumber().toLowerCase().contains("MJ08".toLowerCase()));
    }


    @Then("Click on the Elements to Find Jacket and Verify SKU Number")
    public void clickOnTheElementsToFindJacket() {
        actions.moveToElement(dc.Man).build().perform();
        wait.until(ExpectedConditions.visibilityOf(dc.tops));
        actions.moveToElement(dc.tops).build().perform();
        wait.until(ExpectedConditions.visibilityOf(dc.jacketsButton));
        dc.jacketsButton.click();
        wait.until(ExpectedConditions.visibilityOf(dc.landoGmyJacketImg));
        dc.myClick(dc.landoGmyJacketImg);
        wait.until(ExpectedConditions.visibilityOf(dc.skuNumberText2));
        Assert.assertTrue(getSkuNumber().toLowerCase().contains(dc.skuNumberText2.getText().toLowerCase()));
    }

    public String getSkuNumber() {
        return skuNumber;
    }
}
