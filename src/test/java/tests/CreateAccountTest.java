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
        NewAccountModelPage newAccountModelPage = new NewAccountModelPage(driver);
        String expectedName = accountModel.getAccountName();
        Assert.assertEquals(newAccountModelPage.accountName(), expectedName, "Account isn't created");
    }
}
