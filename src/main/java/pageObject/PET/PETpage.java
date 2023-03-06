package pageObject.PET;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PETpage {

    public static WebDriver driver;

    public PETpage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    // Logo Home Page Amazon
    @FindBy(xpath="//a[@id='nav-logo-sprites']" )
    private WebElement logoAmazonHome;
    public boolean setVerifyHomePage(){
        logoAmazonHome.isDisplayed();
        return true;
    }
    // Menu All Hammburger button
    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private WebElement hamburgerMenuButton;
    public void setHamburgerMenuButton(){
        hamburgerMenuButton.click();
    }
    // Sub Menu Smart Home on Hamburger All menu
    @FindBy(xpath = "//a[.='Smart Home']")
    private WebElement hamburgerMenuItem;
    public void setHamburgerMenuItem(){
        hamburgerMenuItem.click();
    }
    // Sub Menu PET on menu Smart Home
    @FindBy(xpath = "//a[.='Pet']")
    private WebElement hamburgerListItem;
    public void setHamburgerListItem(){
        hamburgerListItem.click();
    }
    // The First Product
    @FindBy(xpath = "//*[@id=\"acs-product-block-0\"]")
    private WebElement firstProduct;
    public void setFirstProduct(){
        firstProduct.click();
    }
    // Add to Cart
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCart;
    public void setAddToCart(){
        addToCart.click();
    }
    // The Second Product
    @FindBy(xpath = "//ol[@class='a-carousel']//div[contains(.,'HD 1080p Pet Camera，Dog Camera 360° Pet Monitor Indoor Cat Camera with Night Vis')]")
    private WebElement secondProduct;
    public void setSecondProduct(){
        secondProduct.click();
    }
    // Delete Product
    @FindBy(xpath = "//div[@class='a-section a-spacing-mini sc-list-body sc-java-remote-feature']/div[4]//span[@class='a-size-small sc-action-delete']//input[@class='a-color-link']")
    private WebElement deleteProduct;
    public void setDeleteProduct(){
        deleteProduct.click();
    }
    // Checkout product
    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    private WebElement buttonCheckOut;
    public void setButtonCheckOut(){
        buttonCheckOut.click();
    }
    // input email or mobile phone number
    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement emailOrMobilePhoneNumber;
    public void setEmailOrMobilePhoneNumber(String userName){
       emailOrMobilePhoneNumber.sendKeys(userName);
    }
    // click button continue
    @FindBy(xpath = "//input[@id='continue']")
    private WebElement buttonContinue;
    public void setButtonContinue(){
        buttonContinue.click();
    }
    // display error message
    @FindBy(xpath = "//span[@class='a-list-item']")
    private WebElement errorMessage;
    public String setErrorMessage(){
        return errorMessage.getText();
    }
}

