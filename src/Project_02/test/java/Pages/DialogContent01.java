package Pages;

import Utilities.GWD01;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent01 extends ParentPage01 {
    public DialogContent01() {
        PageFactory.initElements(GWD01.getDriver(),this);
    }

    @FindBy(xpath = "((//ul[@class='header links'])[1]//a)[2]")
    public WebElement signIn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(xpath = "(//button[@name='send'])[1]")
    public WebElement signInButton;

    @FindBy(xpath = "(//li[@class='greet welcome']/span)[1]")
    public WebElement loginConfirmation;

    @FindBy(xpath = "(//button[@class='action switch'])[1]")
    public WebElement customerMenuDropDown;

    @FindBy(xpath = "((//div[@data-target='dropdown'])[1]//a)[3]")
    public WebElement signOut;

    @FindBy(id = "email-error")
    public WebElement emailErrorText;

    @FindBy(xpath = "(//div[@role='alert']//div)[2]")
    public WebElement passwordErrorText;

    @FindBy(css = "[class='action remind']")
    public WebElement forgetPasswordButton;

    @FindBy(css = "[data-ui-id='page-title-wrapper']")
    public WebElement forgetPasswordText;

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccountButton;

    @FindBy(xpath = "//span[text()='Manage Addresses']")
    public WebElement manageAddressesButton;

    @FindBy(xpath = "//span[text()='Add New Address']")
    public WebElement addNewAddressButton;

    @FindBy(xpath = "//input[@id='telephone']")
    public WebElement telephoneInput;

    @FindBy(xpath = "//input[@id='street_1']")
    public WebElement street1Input;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityInput;

    @FindBy(xpath = "//select[@id='region_id']")
    public WebElement regionIdInput;

    @FindBy(xpath = "//input[@id='zip']")
    public WebElement zipInput;

    @FindBy(xpath = "//span[text()='Save Address']")
    public WebElement saveAddressButton;

    @FindBy(xpath = "//input[@id='primary_billing']")
    public WebElement defaultBilling;

    @FindBy(xpath = "//input[@id='primary_shipping']")
    public WebElement defaultShipping;

    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[text()='OK']")
    public WebElement deleteOk;

    @FindBy(css = "[data-bind*='message.text']")
    public WebElement messageText;

    @FindBy(xpath= "//ol[@class='product-items widget-product-grid']//img[@class='product-image-photo']")
    public WebElement arcProduct1;

    @FindBy(xpath= "(//ol[@class='product-items widget-product-grid']//img[@class='product-image-photo'])[2]")
    public WebElement arcProduct2;

    @FindBy(css= "[title='Add to Cart']")
    public WebElement arcAdd;

    @FindBy(css = "[class='swatch-option text']")
    public WebElement arcSize;

    @FindBy(css = "[class='swatch-option color']")
    public WebElement arcColor;

    @FindBy(css = "[id='qty']")
    public WebElement arcQty;

    @FindBy(css = "[data-bind*='message.text']")
    public WebElement arcVerify;

    @FindBy(css = "[class='action showcart']")
    public WebElement arcShowCart;

    @FindBy(css = "[class='action viewcart']")
    public WebElement arcEditCart;

    @FindBy(xpath = "//a[text()='shopping cart']")
    public WebElement arcGoToCart;

    @FindBy(css = "[class='action action-delete']")
    public WebElement arcDelete;

    @FindBy(css = "[title='Qty']")
    public WebElement arcCartQty;

    @FindBy(css = "[class='action update']")
    public WebElement arcUpdate;

    @FindBy(css = "[id='top-cart-btn-checkout']")
    public WebElement arcStale;

    @FindBy(css = "[class='cart-empty']")
    public WebElement arcCartEmpty;

    @FindBy(xpath = "//span[text()='See Details']")
    public List<WebElement> arcCount;

    @FindBy(css = "[aria-label='store logo']")
    public WebElement homePage;

    @FindBy(xpath = "(//img[@class='product-image-photo'])[5]")
    public WebElement fusionBackpack;

    @FindBy(xpath = "(//button[@title='Add to Cart'])[5]")
    public WebElement addToCart;

    @FindBy(css = "[class='counter-number']")
    public WebElement counterNumber;

    @FindBy(css = "[class='action showcart']")
    public WebElement basket;

    @FindBy(css = "[id='top-cart-btn-checkout']")
    public WebElement proceedToCheckout;

    @FindBy(css = "[type='radio']")
    public  WebElement shippingMethods;

    @FindBy(css = "[data-role='opc-continue']")
    public WebElement nextButton;

    @FindBy(css = "[class='action primary checkout']")
    public WebElement placeOrder;

    @FindBy(xpath = "//ul[@class='header links']/li/a[text()='Create an Account']")
    public WebElement createAccount;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "email_address")
    public WebElement emailAddress;

    @FindBy(id = "password")
    public WebElement registrationPassword;

    @FindBy(id = "password-confirmation")
    public WebElement passwordConfirmation;

    @FindBy(xpath = "//*[@id='form-validate']/div/div[1]/button/span")
    public WebElement registerButton;

    @FindBy(id = "search")
    public WebElement searchInput;

    @FindBy(css = "[title='Search']")
    public WebElement searchButton;

    @FindBy(css = "[class='page-title'] span")
    public WebElement skuNumberText1;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement Man;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement tops;

    @FindBy(xpath = "(//span[text()='Jackets'])[2]")
    public WebElement jacketsButton;

    @FindBy(css = "[alt='Lando Gym Jacket']")
    public WebElement landoGmyJacketImg;

    @FindBy(css = "[itemprop='sku']")
    public WebElement skuNumberText2;

    @FindBy(xpath = "//a[@class='action towishlist' and @data-action='add-to-wishlist']")
    public WebElement wishAddButton;

    @FindBy(xpath = "//*[@id='wishlist-view-form']/div[1]")
    public WebElement wishListNotEmpty;

    @FindBy(xpath = "//img[@class='product-image-photo' and @alt='Radiant Tee']")
    public WebElement wishListProduct;

    @FindBy(css = "a[title='Remove Item']")
    public WebElement wishRemoveButton;

    @FindBy(xpath = "//span[text()='What's New']")
    public WebElement whatsNew;

    @FindBy(xpath = "//a[@href='https://magento.softwaretestingboard.com/' and @title='Go to Home Page']")
    public WebElement homeButton;

    @FindBy(xpath = "//span[text()='Women']") // Women
    public WebElement women;

    @FindBy(xpath = "//span[text()='Men']") // Men
    public WebElement men;

    @FindBy(xpath = "//span[text()='Gear']") // Gear
    public WebElement gear;

    @FindBy(xpath = "//span[text()='Training']")
    public WebElement training;

    @FindBy(xpath = "//span[text()='Sale']")
    public WebElement sale;

    @FindBy(xpath = "(//span[text()='Tops'])[1]")
    public WebElement womenTops;

    @FindBy(xpath = "(//span[text()='Bottoms'])[1]")
    public WebElement womenBottoms;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement menTops;

    @FindBy(xpath = "(//span[text()='Bottoms'])[2]")
    public WebElement menBottoms;







    public WebElement getWebElement(String strElementName) {
        switch (strElementName.trim()){
            case "signIn": return this.signIn;
            case "email": return this.email;
            case "password": return this.password;
            case "signInButton": return this.signInButton;
            case "loginConfirmation": return this.loginConfirmation;
            case "customerMenuDropDown": return this.customerMenuDropDown;
            case "signOut": return this.signOut;
            case "forgetPasswordButton": return this.forgetPasswordButton;
            case "myAccountButton":return this.myAccountButton;
            case "manageAddressesButton": return this.manageAddressesButton;
            case "addNewAddressButton": return this.addNewAddressButton;
            case "telephoneInput": return this.telephoneInput;
            case "street1Input": return this.street1Input;
            case "cityInput": return this.cityInput;
            case "regionIdInput": return this.regionIdInput;
            case "zipInput": return this.zipInput;
            case "saveAddressButton": return this.saveAddressButton;
            case "defaultBilling": return this.defaultBilling;
            case "defaultShipping": return this.defaultShipping;
            case "deleteButton": return this.deleteButton;
            case "deleteOk": return this.deleteOk;
            case "messageText": return this.messageText;
            case "homePage": return this.homePage;
            case "arcProduct1": return this.arcProduct1;
            case "arcProduct2": return this.arcProduct2;
            case "arcAdd": return this.arcAdd;
            case "arcSize": return this.arcSize;
            case "arcColor": return this.arcColor;
            case "arcQty": return this.arcQty;
            case "arcShowCart": return this.arcShowCart;
            case "arcEditCart": return this.arcEditCart;
            case "arcDelete": return this.arcDelete;
            case "arcCartQty": return this.arcCartQty;
            case "arcUpdate": return this.arcUpdate;
            case "arcGoToCart": return this.arcGoToCart;
            case "fusionBackpack": return this.fusionBackpack;
            case "addToCart": return this.addToCart;
            case "basket": return this.basket;
            case "proceedToCheckout": return this.proceedToCheckout;
            case "shippingMethods": return this.shippingMethods;
            case "nextButton": return this.nextButton;
            case "placeOrder": return this.placeOrder;
            case "createAccount": return this.createAccount;
            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "emailAddress": return this.emailAddress;
            case "registrationPassword": return this.registrationPassword;
            case "passwordConfirmation": return this.passwordConfirmation;
            case "registerButton": return this.registerButton;
            case "searchInput": return this.searchInput;
            case "searchButton": return this.searchButton;
            case "Man": return this.Man;
            case "tops": return this.tops;
            case "jacketsButton": return this.jacketsButton;
            case "landoGmyJacketImg": return this.landoGmyJacketImg;
            case "wishAddButton": return this.wishAddButton;
            case "wishListNotEmpty": return this.wishListNotEmpty;
            case "wishListProduct": return this.wishListProduct;
            case "wishRemoveButton": return this.wishRemoveButton;
            case "whatsNew": return this.whatsNew;
            case "women": return this.women;
            case "men": return this.men;
            case "gear": return this.gear;
            case "training": return this.training;
            case "sale": return this.sale;
            case "womenTops": return this.womenTops;
            case "womenBottoms": return this.womenBottoms;
            case "homeButton": return this.homeButton;
            case "menTops": return this.menTops;
            case "menBottoms": return this.menBottoms;


        }
        return null;
    }
}