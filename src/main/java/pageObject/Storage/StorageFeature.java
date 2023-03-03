package pageObject.Storage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StorageFeature {
    public static WebDriver driver;

    public StorageFeature(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//i[@class='hm-icon nav-sprite']")
    private WebElement mainMenButton;
    public void setMainMenButton(){
        mainMenButton.click();
    }

    @FindBy(id = "nav-logo-sprites")
    private WebElement aLandingPage;
    public boolean amazonLandingPage(){
        aLandingPage.isDisplayed();
        return true;
    }
    @FindBy(xpath = "//span[text()='Seagate (STGD2000100) Game Drive for PS4 Systems 2TB External Hard Drive Portable HDD â€“ USB 3.0, Officially Licensed Product']")
    private WebElement product1;
    public void setProduct1(){
        addCart.click();

    }
    @FindBy(xpath = "//span[text()='Seagate Exos X16 14TB 7200 RPM SATA 6Gb/s 256MB Cache 3.5-Inch Internal Data Center HDD Enterprise Hard Drive (ST14000NM001G)']")
    private WebElement product2;
    public void setProduct2(){
        addCart.click();

    }
    @FindBy(xpath = "//span[@id='submit.add-to-cart']/span[@class='a-button-inner']")
    private WebElement addCart;
    public void setAddCart(){
        addCart.click();

    }





}
