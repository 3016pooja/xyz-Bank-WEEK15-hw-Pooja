package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement openAccount;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;



    @CacheLookup
    @FindBy(xpath = "//option[@value='5']")
    WebElement selectTheRightName;
    //By clickcurrency = By.xpath("//select[@id='currency']");

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Pound')]")
    WebElement  pound;

   // By process = By.xpath("//button[contains(text(),'Process')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement  process;

    public void clickOnOpenBankAccountButton(){
        Reporter.log("click on search customer  "+ openAccount.toString());

        clickOnElement(openAccount);
    }
    public void clickOnSearchCustomerName(){
        Reporter.log("click on search customer  "+ searchCustomer.toString());

        clickOnElement(searchCustomer);
    }
    public void clickOnRightCustomerName(){
        Reporter.log("click on search customer  "+ selectTheRightName.toString());

        clickOnElement(selectTheRightName);
    }
    public void selectCurrency(){
        Reporter.log("click on search customer  "+ currency.toString());

        mouseHoverToElementAndClick(currency);
    }
    public void selectPound(){
        Reporter.log("click on pound   "+ pound.toString());

        clickOnElement(pound);
    }
    public void clickOnProcessButton(){
        Reporter.log("click on process buttton  "+ process.toString());

        clickOnElement(process);
    }
    public void popUpAlert(){
        driver.switchTo().alert().accept();
    }
}
