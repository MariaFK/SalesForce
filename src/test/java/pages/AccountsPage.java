package pages;

import constants.Urls;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage{

    private static final Logger LOGGER = LogManager.getLogger(AccountsPage.class.getName());

    @FindBy(xpath = "//ul[contains(@class, 'branding-actions')]//a[@title='New']")
    WebElement NEW_BUTTON;

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open Account Page")
    public AccountsPage openAccountsPage(){
        LOGGER.debug(String.format("Attempt to open URL of account page: %s", Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNTS_URL)));
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNTS_URL));
        return this;
    }

    @Step("Open model to add new account")
    public NewAccountModelPage openNewAccountModel(){
        LOGGER.debug(String.format("Attempt to click element: %s", NEW_BUTTON));
        NEW_BUTTON.click();
        return new NewAccountModelPage(driver);
    }

}
