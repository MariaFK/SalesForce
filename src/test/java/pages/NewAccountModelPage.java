package pages;

import elements.DropdownList;
import elements.TextInput;
import elements.Textarea;
import io.qameta.allure.Step;
import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountModelPage extends BasePage{

    private static final Logger LOGGER = LogManager.getLogger(NewAccountModelPage.class.getName());

    @FindBy (xpath = "//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input\n")
    WebElement ACCOUNT_NAME_INPUT;

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//button[@title='Save']\n")
    WebElement SAVE_BUTTON;

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//span[text()='Copy Billing Address to Shipping Address']//parent::label//span")
    WebElement COPY_BILLING_ADDRESS_TO_SHIPPING_ADDRESS;

    @FindBy(xpath ="//lightning-formatted-text[@class = 'custom-truncate']")
    WebElement ACCOUNT_NAME;

    public NewAccountModelPage(WebDriver driver) {
        super(driver);
    }

    @Step("Fill in account form")
    public void fillInAccountForm(NewAccountModel newAccount){
        LOGGER.debug(String.format("Attempt to send account name: %s", newAccount.getAccountName()));
        ACCOUNT_NAME_INPUT.sendKeys(newAccount.getAccountName());
        LOGGER.debug(String.format("Attempt to send phone: %s", newAccount.getPhone()));
        new TextInput(driver,"Phone").inputText(newAccount.getPhone());
        LOGGER.debug(String.format("Attempt to send Fax: %s", newAccount.getFax()));
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        LOGGER.debug(String.format("Attempt to send Website: %s", newAccount.getWebsite()));
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        LOGGER.debug(String.format("Attempt to send Type: %s", newAccount.getType()));
        new DropdownList(driver, "Type").selectOptionInList(newAccount.getType());
        LOGGER.debug(String.format("Attempt to send Employees: %s", newAccount.getEmployees()));
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        LOGGER.debug(String.format("Attempt to send Industry: %s", newAccount.getIndustry()));
        new DropdownList(driver, "Industry").selectOptionInList(newAccount.getIndustry());
        LOGGER.debug(String.format("Attempt to send Revenue: %s", newAccount.getAnnualRevenue()));
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        LOGGER.debug(String.format("Attempt to send Description: %s", newAccount.getDescription()));
        new Textarea(driver, "Description").inputText(newAccount.getDescription());
        LOGGER.debug(String.format("Attempt to send Billing Street: %s", newAccount.getBillingStreet()));
        new Textarea(driver, "Billing Street").inputText(newAccount.getBillingStreet());
        LOGGER.debug(String.format("Attempt to send Billing City: %s", newAccount.getBillingCity()));
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        LOGGER.debug(String.format("Attempt to send Billing State/Province: %s", newAccount.getBillingStateProvince()));
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingStateProvince());
        LOGGER.debug(String.format("Attempt to send Billing Zip/Postal Code: %s", newAccount.getBillingZipCode()));
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZipCode());
        LOGGER.debug(String.format("Attempt to send Billing Country: %s", newAccount.getBillingCountry()));
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        LOGGER.debug(String.format("Attempt to click element: %s", COPY_BILLING_ADDRESS_TO_SHIPPING_ADDRESS));
        COPY_BILLING_ADDRESS_TO_SHIPPING_ADDRESS.click();
        LOGGER.debug(String.format("Attempt to click element: %s", SAVE_BUTTON));
        SAVE_BUTTON.click();
    }

    public String accountName(){
        String realName = ACCOUNT_NAME.getText();
        return realName;
    }

}
