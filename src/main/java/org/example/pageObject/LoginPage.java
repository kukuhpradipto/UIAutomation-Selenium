package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public static WebDriver driver;
    public  LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(name = "username")
    private WebElement nameUser;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@class='_acan _acap _acas _aj1-']")
    private WebElement login;


    public boolean verifyLoginUser(){
        nameUser.isDisplayed();
        password.isDisplayed();
        return true;
    }

    public void setNameUser(String name){
        nameUser.sendKeys(name);
    }

    public void setPassword(String sandi){
        password.sendKeys(sandi);
    }

    public void setLogin(){
        login.click();
    }



}
