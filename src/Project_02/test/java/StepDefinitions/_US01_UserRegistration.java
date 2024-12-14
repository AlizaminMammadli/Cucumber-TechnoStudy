package StepDefinitions;

import Pages.DialogContent01;
import Utilities.GWD01;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class _US01_UserRegistration {

    DialogContent01 dc = new DialogContent01();
    Actions actions = new Actions(GWD01.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) GWD01.getDriver();
    WebDriverWait wait = new WebDriverWait(GWD01.getDriver(), Duration.ofSeconds(10));

    @And("User navigates to Create Account page")
    public void userNavigatesToCreateAccountPage() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.createAccount));
        js.executeScript("arguments[0].scrollIntoView(true);", dc.createAccount); // Kaydırma işlemi
        js.executeScript("arguments[0].click();", dc.createAccount); // Butona tıklama
    }

    @And("User enters registration details")
    public void userEntersRegistrationDetails(DataTable dataTable) {
        List<Map<String, String>> registrationData = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> data : registrationData) {

            wait.until(ExpectedConditions.visibilityOf(dc.firstName));
            dc.mySendKeys(dc.firstName, data.get("firstName"));

            wait.until(ExpectedConditions.visibilityOf(dc.lastName));
            dc.mySendKeys(dc.lastName, data.get("lastName"));

            wait.until(ExpectedConditions.visibilityOf(dc.emailAddress));
            dc.mySendKeys(dc.emailAddress, data.get("emailAddress"));

            wait.until(ExpectedConditions.visibilityOf(dc.registrationPassword));
            dc.mySendKeys(dc.registrationPassword, data.get("registrationPassword"));

            wait.until(ExpectedConditions.visibilityOf(dc.passwordConfirmation));
            dc.mySendKeys(dc.passwordConfirmation, data.get("passwordConfirmation"));


            userClicksOnRegisterButton();
            wait.until(ExpectedConditions.visibilityOf(dc.messageText));
            Assert.assertTrue(dc.messageText.getText().toLowerCase().contains("thank you for registering"));
            dc.myClick(dc.customerMenuDropDown);
            dc.myClick(dc.signOut);
            dc.myClick(dc.createAccount);


        }

        dc.myClick(dc.signIn);


    }

    public void userClicksOnRegisterButton() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.registerButton));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", dc.registerButton);
        js.executeScript("arguments[0].click();", dc.registerButton);
    }

}



