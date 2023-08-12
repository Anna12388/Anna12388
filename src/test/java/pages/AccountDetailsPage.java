package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class AccountDetailsPage extends BasePage{

    String fieldValue = "//span[text() = '%s']/ancestor::records-record-layout-item//span[contains(@class, 'field-value')]";
    public static final By DETAILS_LINK = By.xpath("//a[@id='detailTab__item']");
    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//*[@class='tabHeader' and @title='Details'])[1]")
    WebElement accountsDetails;

    @FindBy(xpath="(//*[@class='slds-form-element__control slds-grid itemBody']//span)[8]")
    WebElement accountName;

    @FindBy(xpath = "(//*[@class='slds-form-element__control slds-grid itemBody']//span)[11]")
    WebElement accountPhone;

    @FindBy(xpath = "(//*[@class='slds-form-element__control slds-grid itemBody']//span)[16]")
    WebElement accountFax;

    @FindBy(xpath = "(//*[@class='slds-form-element__control slds-grid itemBody']//span)[19]")
    WebElement accountNumber;

    @FindBy(xpath = "(//*[@class='slds-form-element__control slds-grid itemBody']//span)[22]")
    WebElement accountWebsite;

    @FindBy(xpath = "(//*[@class='slds-form-element__control slds-grid itemBody']//span)[25]")
    WebElement accountSite;
    public String getFieldValue(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }

    public String getBillingAddress(Account account){
        return account.getBillingStreet()+"/n"+account.getBillingCity()+account.getBillingState_Provence()+account.getBillingZip_PostalCode()+"/n"+account.getBillingCountry();
    }

    public String getShippingAddress(Account account){
        return account.getShippingStreet()+"/n"+account.getShippingCity()+account.getShippingState_Provence()+account.getShippingZip_PostalCode()+"/n"+account.getShippingCountry();
    }

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }
}