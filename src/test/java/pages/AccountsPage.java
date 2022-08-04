package pages;

import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage{

    @FindBy(xpath = "//ul[contains(@class, 'branding-actions')]//a[@title='New']")
    WebElement NEW_BUTTON;

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage openAccountsPage(){
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNTS_URL));
        return this;
    }

    public NewAccountModelPage openNewAccountModel(){
        NEW_BUTTON.click();
        return new NewAccountModelPage(driver);
    }

}
