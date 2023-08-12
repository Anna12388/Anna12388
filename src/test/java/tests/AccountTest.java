package tests;

import models.Account;
import models.AccountFactory;
import org.testng.Assert;
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

        Account account = AccountFactory.get();

        accountModalPage.create(account);


        Assert.assertEquals(accountDetailsPage.getFieldValue("Account Name"),account.getAccountName());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Phone"),account.getPhone());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Fax"),account.getFax());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Website"),account.getWebSite());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Type"),account.getType());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Industry"),account.getIndustry());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Employees"),account.getEmployees());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Annual Revenue"),account.getAnnualRevenue());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Description"),account.getDescription());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Billing Street"),account.getBillingStreet());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Billing City"),account.getBillingCity());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Billing Zip"),account.getBillingZip_PostalCode());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Billing State"),account.getBillingState_Provence());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Billing Country"),account.getBillingCountry());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Shipping Street"),account.getShippingStreet());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Shipping City"),account.getShippingCity());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Shipping State"),account.getShippingState_Provence());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Shipping Zip"),account.getShippingZip_PostalCode());
        Assert.assertEquals(accountDetailsPage.getFieldValue("Shipping Country"),account.getShippingCountry());



    }
}
