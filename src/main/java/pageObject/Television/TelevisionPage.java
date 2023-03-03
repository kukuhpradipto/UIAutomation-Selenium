package pageObject.Television;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelevisionPage {

    public static WebDriver driver;

    public TelevisionPage( WebDriver driver){
        PageFactory.initElements(driver, this);
        TelevisionPage.driver = driver;
    }

    @FindBy(id = "nav-logo-sprites")
    private WebElement logoAmazonHome;
    public boolean verifyHomePage(){
        logoAmazonHome.isDisplayed();
        return true;
    }


    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    private WebElement hamburgerMenuButton;
    public void setHamburgerMenuButton(){
        hamburgerMenuButton.click();
    }


    @FindBy(xpath = "//a[.='Electronics']")
    private WebElement hamburgerMenuItem;
    public void setHamburgerMenuItem(){
        hamburgerMenuItem.click();
    }

    @FindBy(xpath = "//a[.='Television & Video']")
    private WebElement hamburgerListItem;
    public void setHamburgerListItem(){
        hamburgerListItem.click();
    }

    @FindBy(xpath = "//span[.='Televisions']")
    private WebElement listItem;
    public void setListItem(){
        listItem.click();
    }


    @FindBy(xpath = "//div[@id='brandsRefinements']//li[3]//i[@class='a-icon a-icon-checkbox']")
    private WebElement branch;
    public void setBranch(){
        branch.click();
    }

    @FindBy(xpath = "//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_11']//span[@class='a-size-base-plus a-color-base a-text-normal']")
    private WebElement productPertama;
    public void setProductPertama(){
        productPertama.click();
    }

    @FindBy(xpath = "//span[@id='submit.add-to-cart']/span[@class='a-button-inner']")
    private WebElement addToCartButton;
    public void setAddToCartButton(){
        addToCartButton.click();
    }

    @FindBy(xpath = "//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_5']//span[@class='a-size-base-plus a-color-base a-text-normal']")
    private WebElement productKedua;
    public void setProductKedua(){
        productKedua.click();
    }

    @FindBy(xpath = "//div[@class='a-section a-spacing-mini sc-list-body sc-java-remote-feature']/div[4]//span[@class='a-size-small sc-action-delete']//input[@class='a-color-link']")
    private WebElement deleteProduct;
    public void setDeleteProduct(){
        deleteProduct.click();
    }

    @FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
    private WebElement buttonProccesToCheckout;
    public void setButtonProccesToCheckout(){
        buttonProccesToCheckout.click();
    }

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement inputName;
    public void setInputName(String userName){
        inputName.sendKeys(userName);
    }

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement buttonContinue;
    public void setButtonContinue(){
        buttonContinue.click();
    }

    @FindBy(xpath = "//span[@class='a-list-item']")
    private WebElement errorMessage;
    public String setErrorMessage(){
        return errorMessage.getText();
    }


}
