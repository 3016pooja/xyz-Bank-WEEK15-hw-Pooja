package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    WebElement addCustomer;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNma;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postcode;
    //By clickaddcustomer = By.xpath("//button[@type='submit']");

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomer1;


    public void clickOnAddCustomerButton(){
        Reporter.log("click on add cutomer button "+ addCustomer.toString());
        clickOnElement(addCustomer);
    }
    public void fillTheDetails() {
        Reporter.log("first name "+ firstName.toString());

        sendTextToElement(firstName, "Pooja");
    }
    public void sendLastName(){
        Reporter.log("enter last name "+ lastNma.toString());
        sendTextToElement(lastNma,"Patel");
    }
    public void sendPostcode(){
        Reporter.log("enter postcoed "+ postcode.toString());
        sendTextToElement(postcode,"ha26se");
    }
    public void clickOnAddCustomerButton1(){
        Reporter.log("click on ass cutomer button  "+ addCustomer1.toString());

        clickOnElement(addCustomer1);
    }
    public void popUpAlert(){
        driver.switchTo().alert().accept();
    }



}

