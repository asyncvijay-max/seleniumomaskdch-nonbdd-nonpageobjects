package org.nonbdd.pages;

import org.nonbdd.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage extends BasePage {
    public StorePage(WebDriver driver) {
        super(driver);
    }

    //LOCATORS***************************

    //searchBox
    private final By searchItemInputBox = By.id("woocommerce-product-search-field-0");

    //searchBoxButton
    private final By searchItemBtn = By.cssSelector("[value='Search']");

    //search result results - need to extract text from this locator for assertion
    private final By searchItemResults= By.cssSelector("#main h1");

     // add to cart button
     private final By addToCartButton = By.cssSelector("[aria-label='Add “Blue Shoes” to your cart']");

     // view cart link
    private final By viewCartLink = By.cssSelector("[title='View cart']");


    //ACTIONS ******************************
    public void enterSearchItem(String itemToSearch)
    {
        driver.findElement(searchItemInputBox).sendKeys(itemToSearch);
    }

    public void clickOnSearchItemButton()
    {
        driver.findElement(searchItemBtn).click();
    }

    // Assertion -
    public String searchItemResultsExtractedText()
    {
        return driver.findElement(searchItemResults).getText();
    }

    public void addProducttoTheCart()
    {
        driver.findElement(addToCartButton).click();
    }

     public void clickOnViewCartLink()
     {
         driver.findElement(By.cssSelector("[title='View cart']")).click();
         //goes to CART page
     }


}
