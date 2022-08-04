package pages;

import elements.DropdownList;
import elements.TextInput;
import elements.Textarea;
import models.NewAccountModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountModelPage extends BasePage{

    @FindBy (xpath = "//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input\n")
    WebElement ACCOUNT_NAME_INPUT;

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//button[@title='Save']\n")
    WebElement SAVE_BUTTON;

    @FindBy(xpath = "//div[contains(@class, 'modal-body')]//span[text()='Copy Billing Address to Shipping Address']//parent::label//span")
    WebElement COPY_BILLING_ADDRESS_TO_SHIPPING_ADDRESS;

    public NewAccountModelPage(WebDriver driver) {
        super(driver);
    }

    public void fillInAccountForm(NewAccountModel newAccount){
        ACCOUNT_NAME_INPUT.sendKeys(newAccount.getAccountName());
        new TextInput(driver,"Phone").inputText(newAccount.getPhone());
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        new DropdownList(driver, "Type").selectOptionInList(newAccount.getType());
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        new DropdownList(driver, "Industry").selectOptionInList(newAccount.getIndustry());
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        new Textarea(driver, "Description").inputText(newAccount.getDescription());
        new Textarea(driver, "Billing Street").inputText(newAccount.getBillingStreet());
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingStateProvince());
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZipCode());
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());


        COPY_BILLING_ADDRESS_TO_SHIPPING_ADDRESS.click();
        SAVE_BUTTON.click();
    }
}
