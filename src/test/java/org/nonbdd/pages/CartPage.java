package org.nonbdd.pages;

import org.nonbdd.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    //LOCATORS

    //productNameinthecart - assertion
    private final By productNameinTheCartText = By.cssSelector("td.product-name > a");

     //proceed to checkout button
    private final By checkoutBtn = By.cssSelector(".checkout-button");


    //ACTIONS

    //Assertion
    public String productNameintheCartExtractedText()
    {
        return driver.findElement(productNameinTheCartText ).getText();
    }

    //click on checkout btn
    public void  clickOnCheckOutBtn()
    {
        driver.findElement(checkoutBtn).click();

        //Goes to checkout Page
    }
}
