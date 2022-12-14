package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement  deposit;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Deposit']")
    WebElement  depositbutton;
   // By depositbutton=By.xpath("//button[text()='Deposit']");


    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement DepositSuccessful;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositText;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    WebElement widral;


    @CacheLookup
    @FindBy(xpath = "//input[@ng-model='amount']")
    WebElement addAmoutn;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Withdraw']")
    WebElement clikctheWithdrwaL;
 //   By clikctheWithdrwaL=By.xpath("//button[text()='Withdraw']");
    //By TransactionSuccessful = By.xpath("//span[contains(text(),'Transaction Successful')]");@CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction Successful')]")
    WebElement TransactionSuccessful;
    @CacheLookup
    @FindBy(xpath = "//input[@ng-model='amount']")
    WebElement amount;


    public void clickOnDepositButton(){
        Reporter.log("click on deposite  button "+deposit .toString());
        clickOnElement(deposit);
    }
    public void enterAmount(){
        Reporter.log("click on enter amoutn button "+ amount.toString());

        sendTextToElement(amount,"100");
    }
    public void submitDeposit(){
        Reporter.log("click on add cutomer button "+ depositbutton.toString());

        clickOnElement(depositbutton);
    }
    public String verifyDepoistSucessfully(){
        Reporter.log("verify deposite text  "+ depositText.toString());
        String messager=getTextFromElement(depositText);
        return messager;
    }
    public void clickOnWithdrwal(){
        Reporter.log("click on widrawal button "+ widral.toString());
        clickOnElement(widral);
    }
    public void addAmountForWithdrawl(){
        Reporter.log("add amount  "+ addAmoutn.toString());
        sendTextToElement(addAmoutn,"50");
    }
    public void ClickOnWithdrwal(){
        Reporter.log("click the withdrrwal button  "+ clikctheWithdrwaL.toString());
        clickOnElement(clikctheWithdrwaL);
    }


}