package step_definitions.Storage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.PET.LoginPage;
import pageObject.Television.CheckOutPage;
import pageObject.Storage.StorageFeature;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class PurchaseSteps {

    private WebDriver webDriver;

    public PurchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("User open website Amazon and already landing page") // verifiy tulisan Username
    public void userOpenWebsiteAmazonAndAlreadyLandingPage(){
        StorageFeature storageFeature = new StorageFeature(webDriver);
        Assert.assertTrue(storageFeature.amazonLandingPage());
    }

    @When("User click All main menu")
    public void userClickAllMainMenu() throws InterruptedException {
        StorageFeature storageFeature = new StorageFeature(webDriver);
        storageFeature.setMainMenButton();
        Thread.sleep(1000);

    }

    @And("User click list menu \"(.*)\" in category shop by departement")
    public void userClickListMenuInShopByDepartement(String menu) throws Throwable {
        WebElement a = webDriver.findElement(By.xpath("//a[.='"+menu+"']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("User click list menu \"(.*)\" in category computers")
    public void userClickListMenu(String menu) throws Throwable {
        WebElement a = webDriver.findElement(By.xpath("//a[.='"+menu+"']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("User sort list product Data Storage by featured brands \"(.*)\"")
    public void userSortListProductStorageDataByFeaturedBrandsSeagate(String menu) throws Throwable {
        WebElement a = webDriver.findElement(By.xpath("//div[@id='brandsRefinements']//a[contains(.,'"+menu+"')]"));
        a.click();
        Thread.sleep(1000);

    }
}
