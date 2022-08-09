package pages;

import constants.Credentials;
import constants.Urls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

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
        driver.get(Urls.SALES_FORCE_LOGIN);
        usernameInput.sendKeys(Credentials.USERNAME);
        passwordInput.sendKeys(Credentials.PASSWORD);
        loginButton.click();
    }
}
