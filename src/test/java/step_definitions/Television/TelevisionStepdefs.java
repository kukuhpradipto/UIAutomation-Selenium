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

    @And("User click on Electronics on Hamburger Menu Item")
    public void userClickTelevisionAndVideoHamburgerItem() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setHamburgerMenuItem();
        Thread.sleep(1000);
    }

    @Then("User click on Television and Video list item")
    public void userClickOnListItemTelevision() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setHamburgerListItem();
        Thread.sleep(1000);
    }

    @And("USer click on Television list item")
    public void userClickOnTelevisionListItem() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setListItem();
        Thread.sleep(1000);
    }


    @And("User click on branch Samsung")
    public void userClickOnBranchSamsung() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setBranch();
        Thread.sleep(1000);
    }

    @When("User choose television SAMSUNG 32")
    public void UserChooseTelevesionPertama() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1300)", "");
        Thread.sleep(1000);
        televisionPage.setProductPertama();
        Thread.sleep(1000);
    }

    @Then("User click button Add to Cart")
    public void userClickButtonAddToCart() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setAddToCartButton();
        Thread.sleep(1000);
    }


    @When("User choose television SAMSUNG M5")
    public void userChooseTelevisionSAMSUNGM() throws InterruptedException {
        TelevisionPage televisionPage = new TelevisionPage(webDriver);
        televisionPage.setProductKedua();
        Thread.sleep(1000);
    }

    @And("User click on Button Cart")
    public void userClickCart(){
        WebElement a;
        a = new WebDriverWait(webDriver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='attach-sidesheet-view-cart-button']//input[@class='a-button-input']")));
        a.click();
    }
//    public void userClickOnCloseItem() throws InterruptedException {
//        TelevisionPage televisionPage = new TelevisionPage(webDriver);
//        televisionPage.setCloseItem();
//        Thread.sleep(1000);
//    }

//    @And("User click on Icon Cart")
//    public void userClickOnIconCart() throws InterruptedException {
//        TelevisionPage televisionPage = new TelevisionPage(webDriver);
//        televisionPage.setCloseItem();
//        Thread.sleep(1000);
//    }


}
