package org.nonbdd.pages;

import org.nonbdd.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmationPage extends BasePage {
    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
    }

      //LOCATORS
    private static final By orderConfirmationEle = By.cssSelector(".woocommerce-thankyou-order-received");

    //Actions

    public String orderConfirmationExtractedText()
    {
        return driver.findElement(orderConfirmationEle).getText();
    }
}
