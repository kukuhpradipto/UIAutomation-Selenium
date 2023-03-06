package step_definitions.Television;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.Television.TelevisionPage;
import step_definitions.Hooks;

public class TelevisionStepdefs {

    private static WebDriver webDriver;
    public TelevisionStepdefs (){
        super();
        webDriver = Hooks.webDriver;
    }

    @Given("User already on Home page website amazon")
    public void userAlreadyOnHomePageWebsiteAmazonCom() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        Assert.assertTrue(televisionPage.verifyHomePage());
        Thread.sleep(1000);
    }

    @When("User click Hamburger Button All")
    public void userClickHamburgerButtonAll() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setHamburgerMenuButton();
        Thread.sleep(1000);
    }

    @And("User click on \"(.*)\" on Hamburger Menu Item")
    public void userClickTelevisionAndVideoHamburgerItem(String hamburgerMenuItem) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//div[text()='"+hamburgerMenuItem+"']/parent::a[@class='hmenu-item']"));
        a.click();
        Thread.sleep(1000);
    }

    @Then("User click on \"(.*)\" list item")
    public void userClickOnListItemTelevision(String hamburgerListItem) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//a[text()='"+hamburgerListItem+"']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("USer click on \"(.*)\" list item")
    public void userClickOnTelevisionListItem(String listItem) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//span[text()='"+listItem+"']"));
        a.click();
        Thread.sleep(1000);
    }


    @And("User click on branch \"(.*)\"")
    public void userClickOnBranchSamsung(String branch) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//span[text()='"+branch+"']"));
        a.click();
        Thread.sleep(1000);
    }

    @When("User choose television \"(.*)\"")
    public void UserChooseTelevesionPertama(String productPertama) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1300)", "");
        Thread.sleep(1000);
        WebElement a = webDriver.findElement(By.xpath("//span[text()='"+productPertama+"']"));
        a.click();
        Thread.sleep(1000);
    }

    @When("User choose one more television \"(.*)\"")
    public void UserChooseTelevesionKedua(String productKedua) throws InterruptedException {
        WebElement a = webDriver.findElement(By.xpath("//span[text()='"+productKedua+"']"));
        a.click();
        Thread.sleep(1000);
    }


    @Then("User click button Add to Cart")
    public void userClickButtonAddToCart() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setAddToCartButton();
        Thread.sleep(1000);
    }

    @And("User click on Button Cart")
    public void userClickCart() throws InterruptedException {
        WebElement a;
        a = new WebDriverWait(webDriver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='attach-sidesheet-view-cart-button']//input[@class='a-button-input']")));
        a.click();
        Thread.sleep(1000);
    }

    @And("User Delete one product \"(.*)\"")
    public void userDeleteOneProduct(String deleteProduct) throws InterruptedException {
        WebElement a = webDriver.findElement(By.cssSelector("[aria-label='Delete "+deleteProduct+"']"));
        a.click();
        Thread.sleep(1000);
    }

    @And("User click On button Process to Checkout")
    public void userClickOnButtonProcessToCheckout() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setButtonProccesToCheckout();
        Thread.sleep(1000);
    }

    @When("User input username \"(.*)\"")
    public void userInputRandomUsername(String userName) throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setInputName(userName);
        Thread.sleep(1000);
    }

    @And("User click on Button continue")
    public void userClickOnButtonContinue() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setButtonContinue();
        Thread.sleep(1000);
    }

    @Then("Appear error message \"(.*)\"")
    public void appearErrorMessage(String error) throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        Assert.assertEquals(error, televisionPage.setErrorMessage());
        Thread.sleep(1000);
    }


}
