package step_definitions.PET;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.PET.PETpage;
import step_definitions.Hooks;

public class PETStepdefs {
    private static WebDriver webDriver;
    public PETStepdefs(){
        super();
        webDriver = Hooks.webDriver;
    }
    @Given("User already on Home Page website official amazon")
    public void userAlreadyOnHomePageWebsiteOfficialAmazon() throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        Assert.assertTrue(petPage.setVerifyHomePage());
        Thread.sleep(4000);
    }

    @When("User click hamburger all menu")
    public void userClickHamburgerAllMenu() throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        petPage.setHamburgerMenuButton();
        Thread.sleep(2000);
    }

    @And("User click on menu Smart Home on Menu Item Hamburger")
    public void userClickOnMenuSmartHomeOnMenuItemHamburger() throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        petPage.setHamburgerMenuItem();
        Thread.sleep(2000);
    }

    @Then("User click on menu PET on hamburger all menu")
    public void userClickOnMenuPETOnHamburgerAllMenu() throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        petPage.setHamburgerListItem();
        Thread.sleep(2000);
    }

    @When("User click choose product : PetSafe Smart Feed")
    public void userClickChooseProductPetSafeSmartFeed() throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        petPage.setFirstProduct();
        Thread.sleep(4000);
    }

    @Then("User click button add to cart")
    public void userClickButtonAddToCart() throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        petPage.setAddToCart();
        Thread.sleep(2000);
    }

    @When("User click choose product : HD 1080p Pet Camera")
    public void userClickChooseProductHDPPetCamera() throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        petPage.setSecondProduct();
        Thread.sleep(4000);
    }

    @And("User click on Button Cart")
    public void userClickOnButtonCart() {
        WebElement a;
        a = new WebDriverWait(webDriver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='attach-sidesheet-view-cart-button']//input[@class='a-button-input']")));
        a.click();
    }

    @And("User Delete one product")
    public void userDeleteOneProduct() throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        petPage.setDeleteProduct();
        Thread.sleep(2000);
    }

    @And("User click On button Process to Checkout")
    public void userClickOnButtonProcessToCheckout() throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        petPage.setButtonCheckOut();
        Thread.sleep(2000);
    }

    @When("User input username Email or mobile phone number \"([^\"]*)\"")
    public void userInputUsernameEmailOrMobilePhoneNumber(String userName) throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        petPage.setEmailOrMobilePhoneNumber(userName);
        Thread.sleep(2000);
    }

    @And("User click on Button Continue")
    public void userClickOnButtonContinue() throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        petPage.setButtonContinue();
        Thread.sleep(2000);
    }

    @Then("^Appear error message \"([^\"]*)\"$")
    public void appearErrorMessage(String error) throws InterruptedException {
        PETpage petPage = new PETpage(webDriver);
        Assert.assertEquals(error, petPage.setErrorMessage());
        Thread.sleep(2000);
    }
}
