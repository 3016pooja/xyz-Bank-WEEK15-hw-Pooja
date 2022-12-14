package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

   //By BankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement  bankManager;



    public void clickOnBankMangerButton(){
        Reporter.log("click on bank manager login   "+ bankManager.toString());

        clickOnElement(bankManager);
    }



}
