package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    //By home = By.xpath("//button[contains(text(),'Home')]");

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement home;
    //  By home=By.xpath("//button[contains(text(),'Home')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;
    public void clickOnCustomerLoginPage(){
        Reporter.log("click on search customer  "+ customerLogin.toString());

        clickOnElement(customerLogin);
    }
    public void clickonhomepage(){
        Reporter.log("click on search customer  "+ home.toString());
        clickOnElement(home);
    }


}
