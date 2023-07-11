package tests;

import models.Account;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AccountTest extends BaseTest{

    @Test
    public void accountShouldBeCreated(){

        loginPage.open()
                .login("acumtdu-e8yd@force.com","123456Qq")
                .clickLoginButton();
        accountListPage.open()
                .clickNewButton();
        Account account = new Account("TestName", "www.onliner.by","Investor");

        accountModalPage.create(account);

        assertEquals(accountDetailsPage.getFieldValue("Account Name"), account.getAccountName();
        assertEquals(accountDetailsPage.getFieldValue("Website"), account.getWebSite();
        assertEquals(accountDetailsPage.getFieldValue("Type"), account.getType();

    }
}
