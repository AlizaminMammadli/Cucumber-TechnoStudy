package StepDefinitions;

import Pages.DialogContent01;
import Pages.LeftNav01;
import Utilities.GWD01;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;

public class _US01_Register {
    DialogContent01 dc = new DialogContent01();
    LeftNav01 ln=new LeftNav01();
    static String randomData= RandomStringUtils.randomAlphanumeric(8);

    @Given("Navigate to ParaBank Website")
    public void navigateToParaBankWebsite() {
        GWD01.getDriver().get("https://parabank.parasoft.com/");

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
