package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _US06_UpdateContactInfo {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(15));
    _US01_Register data = new _US01_Register();

    @Then("Contact Update Message Confirmation")
    public void userDeleteTheElementFromDialog() {
        wait.until(ExpectedConditions.visibilityOf(dc.infoUpdateConfirm));
        Assert.assertTrue(dc.infoUpdateConfirm.getText().toLowerCase().contains("have been added"));

    }


    @And("User send precreated keys in LeftNav")
    public void userSendPrecreatedKeysInLeftNav() {
        String loginData = data.randomData;
        ln.mySendKeys(ln.username, loginData);
        ln.mySendKeys(ln.password, loginData);
    }

    @Then("Second Confirmation of Updated Info")
    public void secondConfirmationOfUpdatedInfo() {
        wait.until(ExpectedConditions.visibilityOf(dc.infoFirstName));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dc.infoFirstName, "value"));
        Assert.assertTrue(dc.infoFirstName.getAttribute("value").toLowerCase().equals("ahmet"));
        wait.until(ExpectedConditions.visibilityOf(dc.infoLastName));

        Assert.assertTrue(dc.infoLastName.getAttribute("value").toLowerCase().equals("demir"));
    }

    @And("Click on the Element in LeftNav and Wait")
    public void clickOnTheElementInLeftNavAndWait() {
        wait.until(ExpectedConditions.elementToBeClickable(ln.updateContactInfo));
        ln.myClick(ln.updateContactInfo);
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dc.infoFirstName, "value"));
    }

    @Then("Update Error Confirmation")
    public void updateErrorConfirmation() {
        wait.until(ExpectedConditions.visibilityOf(dc.infoFirstName));

        Assert.assertTrue(dc.firstNameError.isDisplayed());

        Assert.assertTrue(dc.lastNameError.isDisplayed());

        Assert.assertTrue(dc.streetError.isDisplayed());
    }

    @And("User clear keys in Dialog")
    public void userClearKeysInDialog() {

        wait.until(ExpectedConditions.visibilityOf(dc.infoFirstName));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dc.infoFirstName, "value"));
        dc.infoFirstName.clear();
        wait.until(ExpectedConditions.visibilityOf(dc.infoLastName));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dc.infoLastName, "value"));
        dc.infoLastName.clear();
        wait.until(ExpectedConditions.visibilityOf(dc.infoAddress));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dc.infoAddress, "value"));
        dc.infoAddress.clear();

    }
}
