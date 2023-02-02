package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver webDriver;

    @Before
    public void openBrowser () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/home/kukuh/SoftWare/chromedriver_linux64/chromedriver");

        webDriver = new ChromeDriver();
        String appUrl = "https://www.instagram.com/";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
//        webDriver.wait(3000);

    }

    @After
    public void closeBrowser(){
        webDriver.quit();
    }


}
