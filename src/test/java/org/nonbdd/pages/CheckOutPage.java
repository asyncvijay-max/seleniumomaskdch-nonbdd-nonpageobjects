package org.nonbdd.pages;

import org.nonbdd.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends BasePage {


    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    //LOCATORS
   private static final By firstNameTxt =  By.id("billing_first_name");

    private static final By lastNameTxt =  By.id("billing_last_name");

    private static final By billingAddressTxt =  By.id("billing_address_1");

    private static final By billingCityTxt =  By.id("billing_city");

    private static final By postCodeTxt =  By.id("billing_postcode");

    private static final By emailTxt =  By.id("billing_email");

    private static final By placeOrderBtn =  By.id("place_order");




    //ACTIONS

    public void enterFirstName(String fname)
    {
      driver.findElement(firstNameTxt).sendKeys(fname);
    }

    public void enterLastName(String lname)
    {
        driver.findElement(lastNameTxt).sendKeys(lname);
    }
    public void enterbillingAddress(String billAddress)
    {
        driver.findElement(billingAddressTxt).sendKeys(billAddress);
    }

    public void enterbillingCity(String city)
    {
        driver.findElement(billingCityTxt).sendKeys(city);
    }
    public void enterPostalCode(String zipcode)
    {
        driver.findElement(postCodeTxt).sendKeys(zipcode);
    }
    public void enterEmail(String email)
    {
        driver.findElement(emailTxt).sendKeys(email);
    }

    public void enterUserDetails(String fname,String lname,String bAddress,String city,String zipcode,String email)
    {
        enterFirstName(fname);
        enterLastName(lname);
        enterbillingAddress(bAddress);
        enterbillingCity(city);
        enterPostalCode(zipcode);
        enterEmail(email);
    }

    public OrderConfirmationPage placeOrder()
    {
        driver.findElement(placeOrderBtn).click();

        //goes to order confirmation page

        return new OrderConfirmationPage(driver);
    }

}
