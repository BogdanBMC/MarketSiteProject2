package Tests;

import PageObjects.LoginPage;
import TestComponents.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests {

    String mail = "testaugust@gmail.com";
    String pass = "Testtest123?";


    @Test
    public void loginTest(){
       // loginPage = openPage();
        loginPage.login(mail,pass);
    }






}
