package StepDefinitions;

import Utilities.GWD01;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks01 {

    @After
    public void after(Scenario senaryo)
    {
        if (senaryo.isFailed()){
            TakesScreenshot ts=((TakesScreenshot) GWD01.getDriver());
            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }

        GWD01.quitDriver();
    }
}
