package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.internal.protocols.Input;

public class AccountModalPage extends BasePage{

    public static final By NEW_ACCOUNT_TITLE = By.xpath("//h2[contains(@class, 'inlineTitle')]");

    public AccountModalPage(WebDriver driver) {
        super(driver);
    }
    public void create(Account account){
        new Input(driver,"Account Name").write(account.getAccountName());
        new Input(driver,"Website").write(account.getWebSite());
    }
    @Override
    public boolean isPageOpen() {
        return isExist(NEW_ACCOUNT_TITLE);
    }

}
