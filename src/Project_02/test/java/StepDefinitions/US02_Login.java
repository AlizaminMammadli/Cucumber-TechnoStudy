package StepDefinitions;

import Pages.DialogContent01;
import Pages.LeftNav01;
import Utilities.GWD01;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class US02_Login {

    DialogContent01 dc = new DialogContent01();
    LeftNav01 ln = new LeftNav01();
    WebDriverWait wait = new WebDriverWait(GWD01.getDriver(), Duration.ofSeconds(10));

    @Given("Navigate to magento website")
    public void navigateToMagentoWebsite() {

        GWD01.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @Then("Login Success Message Should Appear")
    public void loginSuccessMessageShouldAppear() {
        wait.until(ExpectedConditions.visibilityOf(dc.loginConfirmation));
        Assert.assertTrue(dc.loginConfirmation.isDisplayed());
    }

    @Then("Logout Message Should Appear")
    public void logoutMessageShouldAppear() {
        wait.until(ExpectedConditions.visibilityOf(dc.signIn));
        Assert.assertTrue(dc.signIn.isDisplayed());
    }

    @Then("Required Field Message Should Appear")
    public void requiredFieldMessageShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.emailErrorText));
        Assert.assertTrue(dc.emailErrorText.getText().toLowerCase().contains("required field.".toLowerCase()));

    }

    @Then("Valid Email Address Message Should Appear")
    public void validEmailAddressMessageShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.emailErrorText));
        Assert.assertTrue(dc.emailErrorText.getText().toLowerCase().contains("valid email address".toLowerCase()));
    }

    @Then("Required Field Password Message Should Appear")
    public void requiredFieldPasswordMessageShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.passwordErrorText));
        Assert.assertTrue(dc.passwordErrorText.getText().toLowerCase().contains("incorrect".toLowerCase()));

    }

    @Then("Invalid Password Message Should Appear")
    public void invalidPasswordMessageShouldAppear() {

        wait.until(ExpectedConditions.visibilityOf(dc.passwordErrorText));
        Assert.assertTrue(dc.passwordErrorText.getText().toLowerCase().contains("incorrect".toLowerCase()));
    }

    @Then("Forget Password Page Should Appear")
    public void forgetPasswordPageShouldAppear() {


        wait.until(ExpectedConditions.visibilityOf(dc.forgetPasswordText));
        Assert.assertTrue(dc.forgetPasswordText.getText().toLowerCase().contains("Forgot Your Password".toLowerCase()));

    }
}


