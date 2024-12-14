package Pages;

import Utilities.GWD01;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav01 extends ParentPage01 {
    public LeftNav01() {
        PageFactory.initElements(GWD01.getDriver(),this);
    }

    @FindBy(xpath = "(//ul[@class='nav items']//a)[1]")
    public WebElement myOrders;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[2]")
    public WebElement myDownloadableProducts;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[3]")
    public WebElement myWishList;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[4]")
    public WebElement addressBook;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[5]")
    public WebElement accountInformation;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[6]")
    public WebElement storedPaymentMethods;

    @FindBy(xpath = "(//ul[@class='nav items']//a)[7]")
    public WebElement myProductReviews;

    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "myOrders":return this.myOrders;
            case "myDownloadableProducts":return this.myDownloadableProducts;
            case "myWishList":return this.myWishList;
            case "addressBook":return this.addressBook;
            case "accountInformation":return this.accountInformation;
            case "storedPaymentMethods":return this.storedPaymentMethods;
            case "myProductReviews":return this.myProductReviews;
        }
        return null;
    }
}
