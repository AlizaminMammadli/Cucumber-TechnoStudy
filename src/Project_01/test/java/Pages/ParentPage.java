package Pages;

import Utilities.GWD01;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentPage {
    public WebDriverWait wait = new WebDriverWait(GWD01.getDriver(), Duration.ofSeconds(5));


    public void mySendKeys(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrolltoElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrolltoElement(element);
        element.click();
    }

    public void scrolltoElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD01.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void mySelectByIndex(WebElement element, int index) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrolltoElement(element);
        Select select = new Select(element);
        select.selectByIndex(index);
        wait.until(ExpectedConditions.attributeToBe(element, "value", String.valueOf(index)));
    }

    }

