package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsPage extends BasePage{

    @FindBy(xpath = "//ul[contains(@class, 'branding-actions')]//a[@title='New']")
    WebElement newButton;

    public AccountsPage(WebDriver driver) {
        super(driver);
    }
}
