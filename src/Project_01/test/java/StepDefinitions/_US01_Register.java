package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

public class _US01_Register {
    DialogContent dc = new DialogContent();
    LeftNav ln=new LeftNav();
    static String randomData= RandomStringUtils.randomAlphanumeric(8);

    @Given("Navigate to ParaBank Website")
    public void navigateToParaBankWebsite() {
        GWD.getDriver().get("https://parabank.parasoft.com/");

    }

    @And("User send random keys in Dialog")
    public void userSendRandomKeysInDialog() {
        randomData= RandomStringUtils.randomAlphanumeric(8);

        dc.mySendKeys(dc.firstName,randomData);
        dc.mySendKeys(dc.lastName,randomData);
        dc.mySendKeys(dc.address,randomData);
        dc.mySendKeys(dc.city,randomData);
        dc.mySendKeys(dc.state,randomData);
        dc.mySendKeys(dc.zipCode,randomData);
        dc.mySendKeys(dc.phone,randomData);
        dc.mySendKeys(dc.ssn,randomData);
        dc.mySendKeys(dc.userName,randomData);
        dc.mySendKeys(dc.password,randomData);
        dc.mySendKeys(dc.confirmPassword,randomData);

    }

}
