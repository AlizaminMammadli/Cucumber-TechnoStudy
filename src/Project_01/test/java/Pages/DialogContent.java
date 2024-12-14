package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DialogContent extends ParentPage {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement address;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement city;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement state;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement zipCode;
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement phone;
    @FindBy(xpath = "//input[@id='customer.ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement confirmPassword;
    @FindBy(css = "input.button[value='Register']")
    public WebElement registerButton2;
    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement billName;
    @FindBy(xpath = "//input[@name='payee.address.street']")
    public WebElement billAddress;
    @FindBy(xpath = "//input[@name='payee.address.city']")
    public WebElement billCity;
    @FindBy(xpath = "//input[@name='payee.address.state']")
    public WebElement billState;
    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public WebElement billZipCode;
    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    public WebElement billPhoneNum;
    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public WebElement billAccNum;
    @FindBy(xpath = "//input[@name='verifyAccount']")
    public WebElement billAccNumVrf;
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement billAmount;
    @FindBy(xpath = "//select[@name='fromAccountId']")
    public WebElement billSelectAcc;
    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement billPaymentButton;
    @FindBy(xpath = "//span[@id='amount']")
    public WebElement billPaymentAmount;
    @FindBy(xpath = "//div[@id='rightPanel']")
    public WebElement messageBoxDC;
    @FindBy(xpath = "//table[@id='accountTable']//a")
    public WebElement accTableFirstAcc;
    @FindBy(xpath = "//a[starts-with(text(),'Bill Payment to')]")
    public WebElement billPayment;
    @FindBy(css = "[id='amount']")
    public WebElement amount;
    @FindBy(id = "fromAccountId")
    public WebElement fromAccountSelect;
    @FindBy(css = "[id='fromAccountId']>option")
    public WebElement fromAccountSelect1;
    @FindBy(id = "toAccountId")
    public WebElement toAccountSelect;
    @FindBy(css = "[id='toAccountId']>:nth-child(2)")
    public WebElement toAccountSelect1;
    @FindBy(css = "[value='Transfer']")
    public WebElement transferButton;
    @FindBy(css = "[id='showResult'] > :nth-child(1)")
    public WebElement transferControlMessage;
    @FindBy(xpath = "(//table[@id='accountTable']//a)[2]")
    public WebElement fromAccountId;
    @FindBy(xpath = "(//table[@id='transactionTable']//tr[last()])[2]")
    public WebElement lastFundsTransferReceived;
    @FindBy(xpath = "(//td[@align='right'])[2]/following-sibling::td")
    public WebElement dateControl;
    @FindBy(xpath = "(//td[@align='right'])[5]/following-sibling::td")
    public WebElement amountControl;
    @FindBy(xpath = "(//td[@align='right'])[5]/following-sibling::td")
    public WebElement amountControl2;
    @FindBy(css = "[id='accountId']")
    public WebElement selectAccountInFindTransaction;
    @FindBy(xpath = "//select[@id='accountId']/option[last()]")
    public WebElement selectLastNumber;
    @FindBy(xpath = "(//div[@id='rightPanel']//td)[2]")
    public WebElement transactionIdtext;
    @FindBy(css = "[id='transactionId']")
    public WebElement transactionIdinput;
    @FindBy(css = "[id='transactionDate']")
    public WebElement transactionDateinput;
    @FindBy(css = "[id='findById']")
    public WebElement findTransactionButton;
    @FindBy(css = "[id='findByDate']")
    public WebElement transactiDateButton;
    @FindBy(xpath = "//h1[@class='title']")
    public WebElement errorMessage;
    @FindBy(css = "[id='amount']")
    public WebElement loanAmount;
    @FindBy(css = "[id='downPayment']")
    public WebElement downPayment;
    @FindBy(css = "[id='fromAccountId']")
    public WebElement loanSelect;
    @FindBy(css = "[value='Apply Now']")
    public WebElement applyNow;
    @FindBy(css = "[id='loanStatus']")
    public WebElement statuMessage;
    @FindBy(css = "[id='newAccountId']")
    public WebElement newAccoutId;
    @FindBy(css = "[id='noTransactions']")
    public WebElement noTransaction;
    @FindBy(css = "[id='loanRequestDenied']")
    public WebElement deniedMessage;
    @FindBy(css = "[id='customer.firstName']")
    public WebElement infoFirstName;
    @FindBy(css = "[id='customer.lastName']")
    public WebElement infoLastName;
    @FindBy(css = "[id='customer.address.street']")
    public WebElement infoAddress;
    @FindBy(css = "[id='customer.address.city']")
    public WebElement infoCity;
    @FindBy(css = "[id='customer.address.state']")
    public WebElement infoState;
    @FindBy(css = "[id='customer.address.zipCode']")
    public WebElement infoZipCode;
    @FindBy(css = "[id='customer.phoneNumber']")
    public WebElement infoPhone;
    @FindBy(css = "[value='Update Profile']")
    public WebElement updateProfileButton;
    @FindBy(css = "[id='updateProfileResult']>p")
    public WebElement infoUpdateConfirm;
    @FindBy(css = "[id='firstName-error']")
    public WebElement firstNameError;
    @FindBy(css = "[id='lastName-error']")
    public WebElement lastNameError;
    @FindBy(css = "[id='street-error']")
    public WebElement streetError;
    @FindBy(xpath = "//*[@id='type']")
    public WebElement accountTypeDropdown;
    @FindBy(xpath = "//*[@id='fromAccountId']")
    public WebElement accountBalanceDdown;
    @FindBy(xpath = "(//div[@id='openAccountForm']//b)[2]")
    public WebElement minimumBalance;
    @FindBy(xpath = "//input[@value='Open New Account' and @class='button']")
    public WebElement newAccountBtn;
    @FindBy(xpath = "//div[@id='openAccountResult']//h1")
    public WebElement successNewAccount;







    public void verifyMessageContainsText( String value) {
        wait.until(ExpectedConditions.visibilityOf(this.messageBoxDC));
        Assert.assertTrue(this.messageBoxDC.getText().toLowerCase().contains(value.toLowerCase()));
    }

    public WebElement getWebElement(String strElementName) {
        switch (strElementName.trim()) {
            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "address": return this.address;
            case "city": return this.city;
            case "state": return this.state;
            case "zipCode": return this.zipCode;
            case "phone": return this.phone;
            case "ssn": return this.ssn;
            case "username": return this.userName;
            case "password": return this.password;
            case "confirmPassword": return this.confirmPassword;
            case "registerButton2": return this.registerButton2;
            case "billName":return this.billName;
            case "billAddress":return this.billAddress;
            case "billCity":return this.billCity;
            case "billState":return this.billState;
            case "billZipCode":return this.billZipCode;
            case "billPhoneNum":return this.billPhoneNum;
            case "billAccNum":return this.billAccNum;
            case "billAccNumVrf":return this.billAccNumVrf;
            case "billAmount":return this.billAmount;
            case "billSelectAcc":return this.billSelectAcc;
            case "billPaymentButton":return this.billPaymentButton;
            case "messageBoxDC":return this.messageBoxDC;
            case "accTableFirstAcc":return this.accTableFirstAcc;
            case "billPayment1":return this.billPayment;
            case "amount": return this.amount;
            case "fromAccountSelect": return  this.fromAccountSelect;
            case "fromAccountSelect1": return this.fromAccountSelect1;
            case "toAccountSelect": return this.toAccountSelect;
            case "toAccountSelect1": return this.toAccountSelect1;
            case "transferButton": return this.transferButton;
            case "transferControlMessage": return this.transferControlMessage;
            case "fromAccountId": return this.fromAccountId;
            case "lastFundsTransferReceived": return this.lastFundsTransferReceived;
            case "dateControl": return this.dateControl;
            case "amountControl": return this.amountControl;
            case "amountControl2": return this.amountControl2;
            case "selectAccountInFindTransaction": return this.selectAccountInFindTransaction;
            case "selectLastNumber": return this.selectLastNumber;
            case "transactionIdinput": return this.transactionIdinput;
            case "transactionDateinput": return this.transactionDateinput;
            case "transactiDateButton": return this.transactiDateButton;
            case "findTransactionButton": return this.findTransactionButton;
            case "transactionIdtext": return this.transactionIdtext;
            case "errorMessage": return this.errorMessage;
            case "loanAmount": return this.loanAmount;
            case "downPayment": return this.downPayment;
            case "loanSelect": return this.loanSelect;
            case "applyNow": return this.applyNow;
            case "statuMessage": return this.statuMessage;
            case "newAccoutId": return this.newAccoutId;
            case "noTransaction": return this.noTransaction;
            case "deniedMessage": return this.deniedMessage;
            case "infoFirstName": return this.infoFirstName;
            case "infoLastName": return this.infoLastName;
            case "infoAddress": return this.infoAddress;
            case "infoCity": return this.infoCity;
            case "infoState": return this.infoState;
            case "infoZipCode": return this.infoZipCode;
            case "infoPhone": return this.infoPhone;
            case "updateProfileButton": return this.updateProfileButton;
            case "infoUpdateConfirm": return this.infoUpdateConfirm;
            case "accountTypeDropdown": return this.accountTypeDropdown;
            case "accountBalanceDdown": return this.accountBalanceDdown;
            case "newAccountBtn": return this.newAccountBtn;
        }
        return null;
    }


}
