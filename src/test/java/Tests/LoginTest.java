package Tests;

import PageObjects.LoginPage;
import TestComponents.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests {

    String mail = "testaugust@gmail.com";
   String pass = "Testtest123?";

/*
    String mail = System.getProperty("email");
    String pass = System.getProperty("password");
*/

    @Test
    public void loginTest() throws InterruptedException {
        loginPage.login(mail,pass);
    }






}
