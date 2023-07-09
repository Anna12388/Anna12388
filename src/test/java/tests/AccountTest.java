package tests;

import models.Account;
import org.testng.annotations.Test;

public class AccountTest extends BaseTest{

    @Test
    public void accountShouldBeCreated(){

        loginPage.open()
                .login("acumtdu-e8yd@force.com","123456Qq")
                .clickLoginButton();
        accountListPage.open()
                .clickNewButton()
        Account account = new Account("TestName", "www.onliner.by");
        accountModalPage.create(account);

    }
}
