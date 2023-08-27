package TestComponents;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTests {

public WebDriver driver;
public LoginPage loginPage;

public WebDriver initialiseDriver(){

    String browser = "firefox";

    if (browser.equalsIgnoreCase("firefox")){
         driver = new FirefoxDriver();

    }

   // driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    return driver;

}

@BeforeMethod(alwaysRun = true) // ASTA RULEAZA ORICUM NU MAI LUA TEAPA ASTA PLM
public LoginPage openPage(){
    driver= initialiseDriver();
    loginPage = new LoginPage(driver);
    return loginPage;
}


@AfterMethod
    public void closeDriver(){
    driver.close();
}



}
