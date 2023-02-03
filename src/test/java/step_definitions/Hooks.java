package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver webDriver;

    @Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","/home/kukuh/AlteraAcademy/Automation/BDDSourceDemo/driver/chromedriver");


        webDriver = new ChromeDriver();
        String appUrl = "https://www.facebook.com/?stype=lo&jlou=AfcN47Xlz6u06dl1rAu3f5CalF-EcXlXB0t1-V6ITiqkD1869ns82sJqH0JYkzChPQbdk2ef6zrHIkwdCh-hlNl7JbpXxIJp9xwf1rqeR2fWjA&smuh=53382&lh=Ac89zypcN83ZyiTM7D4";
        webDriver.get(appUrl);
        webDriver.manage().window().maximize();
//        webDriver.wait(3000);

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        webDriver.quit();
    }


}
