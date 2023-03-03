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



}
