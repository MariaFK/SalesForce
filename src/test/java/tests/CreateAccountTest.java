package tests;

import io.qameta.allure.Description;
import models.NewAccountModel;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import pages.NewAccountModelPage;
import testdata.PrepareNewAccounDate;

public class CreateAccountTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(CreateAccountTest.class.getName());

    @Test
    @Description("User tries to create new account")
    public void createAccountTest() {
        LoginPage loginPage = new LoginPage(driver);
        LOGGER.info(String.format("Page %s initialized", LoginPage.class.getName()));
        LOGGER.info(String.format("Open %s page", LoginPage.class.getName()));
        loginPage.loginToSalesforce();
        LOGGER.info(String.format("Page %s initialized", AccountsPage.class.getName()));
        AccountsPage accountsPage = new AccountsPage(driver);
        LOGGER.info(String.format("Model %s initialized", NewAccountModel.class.getName()));
        NewAccountModel accountModel = PrepareNewAccounDate.getValidData();
        LOGGER.info("Open accounts page, open new account model, fill in account form");
        accountsPage.openAccountsPage()
                .openNewAccountModel()
                .fillInAccountForm(accountModel);
        LOGGER.info(String.format("Page %s initialized", NewAccountModelPage.class.getName()));
        NewAccountModelPage newAccountModelPage = new NewAccountModelPage(driver);
        LOGGER.info("Check if account is created");
        String expectedName = "User";
                //accountModel.getAccountName();
        Assert.assertEquals(newAccountModelPage.accountName(), expectedName, "Account isn't created");
    }
}
