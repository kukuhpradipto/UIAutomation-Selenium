package step_definitions.Television;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.PET.PETpage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

public class LoginSteps {

    private WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User open the website sauce demo") // verifiy tulisan Username
    public void verifyLogin(){
        PETpage PETpage = new PETpage(webDriver);
        Assert.assertTrue(PETpage.verifyLoginPage());
    }

    @When("User input \"(.*)\" as userName and Input \"(.*)\" as password")
    public void inputCredential(String userName, String password) throws InterruptedException {
        PETpage PETpage = new PETpage(webDriver);
        PETpage.setUserName(userName);
        PETpage.setPassword(password);
        PETpage.clickLogin();
        Thread.sleep(1000);
    }

    //IF ERROR
    @Then("User see error \"(.*)\" on login page" )
    public void verifyErrorText( String errorText){
        PETpage PETpage = new PETpage(webDriver);
        Assert.assertEquals(errorText, PETpage.verifyErrorText());
    }
}
