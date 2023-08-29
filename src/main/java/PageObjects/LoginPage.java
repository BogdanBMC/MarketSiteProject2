package PageObjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

public LoginPage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);
}

// "https://rahulshettyacademy.com/client/"
  //  EMAIL - "testaugust@gmail.com"
   // PASS - "Testtest123?"


    @FindBy(id = "userEmail")
WebElement emailField;

@FindBy(id = "userPassword")
    WebElement passField;

@FindBy(id = "login")
    WebElement loginButton;

    public void login(String email, String pass) throws InterruptedException {
    driver.get("https://rahulshettyacademy.com/client/");
    emailField.sendKeys(email);
    passField.sendKeys(pass);
    loginButton.click();
    Thread.sleep(3000);

    driver.findElement(By.xpath("//button[text()='  Cart ']")).click();
}

}
