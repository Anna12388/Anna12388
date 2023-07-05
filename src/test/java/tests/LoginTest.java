package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class LoginTest extends BaseTest{
    @Test
    public void loginWithValidData(){
        loginPage.open();
        loginPage.isPageOpen();
        loginPage.login("acumtdu-e8yd@force.com","123456Qq");
        loginPage.clickLoginButton();

        assertTrue(homePage.isPageOpen(),"Страница Home page не загружена");


    }
}
