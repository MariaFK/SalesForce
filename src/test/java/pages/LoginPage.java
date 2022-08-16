package pages;

import constants.Credentials;
import constants.Urls;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.CreateAccountTest;

public class LoginPage extends BasePage {

    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "username")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "Login")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginToSalesforce() {
        LOGGER.debug(String.format("Attempt to open URl: %s", Urls.SALES_FORCE_LOGIN));
        driver.get(Urls.SALES_FORCE_LOGIN);
        LOGGER.debug("Attempt to send username");
        usernameInput.sendKeys(Credentials.USERNAME);
        LOGGER.debug("Attempt to send password");
        passwordInput.sendKeys(Credentials.PASSWORD);
        LOGGER.debug(String.format("Attempt to click element: %s", loginButton));
        loginButton.click();
    }
}
