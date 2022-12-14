package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {
    BankManagerLoginPage bankManagerLoginPage;
    CustomerLoginPage customerLoginPage;
    AddCustomerPage addCustomePage;
    OpenAccountPage openAccountPage;
    HomePage homePage=new HomePage();
    CustomerPage customerPage;
    AccountPage accountPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        bankManagerLoginPage=new BankManagerLoginPage();
        customerLoginPage=new CustomerLoginPage();
        addCustomePage=new AddCustomerPage();
        openAccountPage=new OpenAccountPage();
        homePage=new HomePage();
        customerPage=new CustomerPage();
        accountPage=new AccountPage();

    }

    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully(){
        //click On "Bank Manager Login" Tab
      bankManagerLoginPage.clickOnBankMangerButton();

        //click On "Add Customer" Tab
        addCustomePage.clickOnAddCustomerButton();

       // enter FirstName // enter LastName       // enter PostCode
        addCustomePage.fillTheDetails();
        addCustomePage.sendLastName();
        addCustomePage.sendPostcode();

        //click On "Add Customer" Button
        addCustomePage.clickOnAddCustomerButton1();
       // popup display
        addCustomePage.popUpAlert();
       // verify message "Customer added successfully"
       // click on "ok" button on popup.
    }
    @Test(groups = {"smoke","regression"})
  public void   bankManagerShouldOpenAccountSuccessfully(){
        bankManagerLoginPage.clickOnBankMangerButton();
        addCustomePage.clickOnAddCustomerButton();

        addCustomePage.fillTheDetails();
        addCustomePage.sendLastName();
        addCustomePage.sendPostcode();

        addCustomePage.clickOnAddCustomerButton1();
        addCustomePage.popUpAlert();

        openAccountPage.clickOnOpenBankAccountButton();
        openAccountPage.clickOnSearchCustomerName();
        openAccountPage.clickOnRightCustomerName();
           openAccountPage.selectCurrency();
         openAccountPage.selectPound();

        openAccountPage.clickOnProcessButton();

        openAccountPage.popUpAlert();

  }
  @Test(groups = "regression")
    public void customerShouldLoginAndLogoutSuceessfully(){
      bankManagerLoginPage.clickOnBankMangerButton();
      //click On "Add Customer" Tab
      addCustomePage.clickOnAddCustomerButton();

      // enter FirstName // enter LastName       // enter PostCode
      addCustomePage.fillTheDetails();
      addCustomePage.sendLastName();
      addCustomePage.sendPostcode();

      //click On "Add Customer" Button
      addCustomePage.clickOnAddCustomerButton1();
      // popup display
     addCustomePage.popUpAlert();
      homePage.clickonhomepage();
     // click on "Customer Login" Tab
      homePage.clickOnCustomerLoginPage();

      //search customer that you created.
      customerPage.clickOnSearchTheCustomerField();
      customerPage.serchTheName();
      //verify "Logout" Tab displayed.
      customerPage.clickOnLoginButton();

      //verify "Your Name" text displayed.

      Assert.assertEquals(customerPage.VerifyYourNameText(),"Pooja Patel","text verified");
      //click on "Logout"
      customerPage.clickOnLogoutButton();
  }
  @Test(groups = "regression")
    public void customerShouldDepositMoneySuccessfully(){
      bankManagerLoginPage.clickOnBankMangerButton();
     addCustomePage.clickOnAddCustomerButton();

      addCustomePage.fillTheDetails();
      addCustomePage.sendLastName();
      addCustomePage.sendPostcode();

     addCustomePage.clickOnAddCustomerButton1();
     addCustomePage.popUpAlert();
     openAccountPage.clickOnOpenBankAccountButton();
     openAccountPage.clickOnSearchCustomerName();
     openAccountPage.clickOnRightCustomerName();
     openAccountPage.clickOnProcessButton();

      openAccountPage.selectCurrency();
      openAccountPage.selectPound();

      openAccountPage.clickOnProcessButton();

      openAccountPage.popUpAlert();
      homePage.clickonhomepage();

      homePage.clickOnCustomerLoginPage();
      //search customer that you created.
      customerPage.clickOnSearchTheCustomerField();
      // click on "Login" Button
      customerPage.serchTheName();
      //verify "Logout" Tab displayed.
      //customerPage.clickOnLoginButton();
      homePage.clickonhomepage();
      accountPage.clickOnDepositButton();

accountPage.enterAmount();
     // click on "Deposit" Button
      accountPage.submitDeposit();
      Assert.assertEquals(accountPage.verifyDepoistSucessfully(),"Deposit Successful","text verified");

  }
  @Test(groups = "regression")
    public void  customerShouldWithdrawMoneySuccessfully(){
      bankManagerLoginPage.clickOnBankMangerButton();
      //click On "Add Customer" Tab
      addCustomePage.clickOnAddCustomerButton();

      // enter FirstName // enter LastName       // enter PostCode
      addCustomePage.fillTheDetails();
      addCustomePage.sendLastName();
      addCustomePage.sendPostcode();

      //click On "Add Customer" Button
      addCustomePage.clickOnAddCustomerButton1();
      // popup display
      addCustomePage.popUpAlert();
      homePage.clickonhomepage();
      // click on "Customer Login" Tab
      homePage.clickOnCustomerLoginPage();

      //search customer that you created.
      customerPage.clickOnSearchTheCustomerField();
      customerPage.serchTheName();
      //verify "Logout" Tab displayed.
      customerPage.clickOnLoginButton();

      // click on "Customer Login" Tab
      homePage.clickOnCustomerLoginPage();

      //search customer that you created.
      customerPage.clickOnSearchTheCustomerField();
      customerPage.serchTheName();
      customerPage.clickOnLoginButton();
      //click on "Withdrawl" Tab
      accountPage.clickOnWithdrwal();
     // Enter amount 50
      accountPage.addAmountForWithdrawl();
      //click on "Deposit" Button
      accountPage.ClickOnWithdrwal();
      //verify message "Transaction Successful"



    }
}
