package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;

    @CacheLookup
    @FindBy(xpath = "//option[@value='6']")
    WebElement yourName;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement Logout;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement Logout1;

    @CacheLookup
    @FindBy(xpath  ="//span[contains(text(),'Pooja Patel')]")
    WebElement nameText;


    public void clickOnSearchTheCustomerField() {
        Reporter.log("click on search customer  "+ searchCustomer.toString());
        clickOnElement(searchCustomer);
    }
    public void serchTheName(){
        Reporter.log("click on your name  customer  "+ yourName.toString());

        clickOnElement(yourName);
    }
    public void clickOnLoginButton(){
        Reporter.log("click on login  "+ login.toString());

        clickOnElement(login);
    }
    public void clickOnLogoutButton(){
        Reporter.log("click on logout  "+ Logout.toString());

        clickOnElement(Logout);
    }
    public String VerifyYourNameText(){
        Reporter.log("click on search customer  "+ nameText.toString());

        return getTextFromElement(nameText);
    }



}