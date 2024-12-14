package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LeftNav extends ParentPage {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='leftmenu']//a[text()='About Us']")
    public WebElement aboutUs;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[text()='Services']")
    public WebElement services;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[text()='Products']")
    public WebElement products;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[text()='Locations']")
    public WebElement locations;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[text()='Admin Page']")
    public WebElement adminPage;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;
    @FindBy(xpath = "//a[text()='Forgot login info?']")
    public WebElement forgotLoginInfo;
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;
    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccount;
    @FindBy(xpath = "//a[text()='Accounts Overview']")
    public WebElement accountsOverview;
    @FindBy(xpath = "//a[text()='Transfer Funds']")
    public WebElement transferFunds;
    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement billPay;
    @FindBy(xpath = "//a[text()='Find Transactions']")
    public WebElement findTransactions;
    @FindBy(xpath = "//a[text()='Update Contact Info']")
    public WebElement updateContactInfo;
    @FindBy(xpath = "//a[text()='Request Loan']")
    public WebElement requestLoan;
    @FindBy(xpath = "//a[text()='Log Out']")
    public WebElement logout;
    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement welcomeMessage;


    public void verifyLoginMessageContainsText(String value) {
        wait.until(ExpectedConditions.visibilityOf(this.welcomeMessage));
        Assert.assertTrue(this.welcomeMessage.getText().toLowerCase().contains(value.toLowerCase()));
    }

    public WebElement getWebElement(String strElementName) {
        switch (strElementName.trim()) {
            case "aboutUs":return this.aboutUs;
            case "services":return this.services;
            case "products":return this.products;
            case "locations":return this.locations;
            case "adminPage":return this.adminPage;
            case "username":return this.username;
            case "password":return this.password;
            case "loginButton":return this.loginButton;
            case "forgotLoginInfo":return this.forgotLoginInfo;
            case "register":return this.register;
            case "openNewAccount":return this.openNewAccount;
            case "accountsOverview":return this.accountsOverview;
            case "transferFunds":return this.transferFunds;
            case "billPay":return this.billPay;
            case "findTransactions":return this.findTransactions;
            case "updateContactInfo":return this.updateContactInfo;
            case "requestLoan":return this.requestLoan;
            case "logout":return this.logout;
            case "welcomeMessage":return this.welcomeMessage;

        }
        return null;
    }
}
