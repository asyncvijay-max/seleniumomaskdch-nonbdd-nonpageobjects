package org.nonbdd.pages;

import org.nonbdd.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    //LOCATORS

    //Store Link
    private final By storeLink = By.cssSelector("#menu-item-1227 > a");


    //ACTIONS
    public void navigateToStorePagefromHomePage()
    {
          driver.findElement(storeLink).click();


    }



}
