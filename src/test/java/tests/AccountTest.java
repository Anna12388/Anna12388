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

        Account account = new Account("Test1","www.onliner.by","Investor", "Banking",
                "36749400","346789100","10","12","66801","12345",
                "1358","1000","Hamburg","567899","90986",
                "Germany","new article", "GrosseBleichen","DHL345");


        accountModalPage.create(account);

        assertEquals(accountDetailsPage.getFieldValue("Account Name"), account.getAccountName());
        assertEquals(accountDetailsPage.getFieldValue("Website"), account.getWebSite());
        assertEquals(accountDetailsPage.getFieldValue("Type"), account.getType());
        assertEquals(accountDetailsPage.getFieldValue("Industry"), account.getIndustry());
        assertEquals(accountDetailsPage.getFieldValue("Phone"), account.getPhone());
        assertEquals(accountDetailsPage.getFieldValue("Fax"), account.getFax());
        assertEquals(accountDetailsPage.getFieldValue("Employees"), account.getEmployees());
        assertEquals(accountDetailsPage.getFieldValue("Annual Revenue"), account.getAnnualRevenue() + "000 000 000 Br");
        assertEquals(accountDetailsPage.getFieldValue("Description"), account.getDescription());
        assertEquals(accountDetailsPage.getFieldValue("Billing Address"), accountDetailsPage.getBillingAddress(account);
        assertEquals(accountDetailsPage.getFieldValue("Shipping Address"), accountDetailsPage.getShippingAddress(account);


    }
}
