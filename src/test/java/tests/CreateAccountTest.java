package tests;

import models.NewAccountModel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import pages.NewAccountModelPage;
import testdata.PrepareNewAccounDate;

public class CreateAccountTest extends BaseTest {

    @Test
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToSalesforce();
        AccountsPage accountsPage = new AccountsPage(driver);
        NewAccountModel accountModel = PrepareNewAccounDate.getValidData();
        accountsPage.openAccountsPage()
                .openNewAccountModel()
                .fillInAccountForm(accountModel);

        String expectedName = accountModel.getAccountName();
        String realName = driver.findElement(By.xpath("//lightning-formatted-text[@class = 'custom-truncate']"))
                .getText();
        Assert.assertEquals(realName, expectedName, "Account isn't created");
    }
}
