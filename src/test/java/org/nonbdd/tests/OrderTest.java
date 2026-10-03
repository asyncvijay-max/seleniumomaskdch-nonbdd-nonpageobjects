package org.nonbdd.tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderTest
{
    @Test
    public void guestCheckOutOrderConfirmation()
    {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.askomdch.com");



        //store link on Home Page -> GOES to Store Page
        driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();

         //STORE page
        //search text box on Store Page
        driver.findElement(By.id("woocommerce-product-search-field-0")).sendKeys("Blue");

        //search button on Store Page
        driver.findElement(By.cssSelector("[value='Search']")).click();

        //search result text - we need to extract it and assert it
        String searchItemTextResult = driver.findElement(By.cssSelector("#main h1")).getText();

        //Assertion on searched Text
        Assert.assertEquals(searchItemTextResult,"Search results: “Blue”");

        //click on blue shoe -  add to cart button on Store Page
        driver.findElement(By.cssSelector("[aria-label='Add “Blue Shoes” to your cart']")).click();

        //click on view cart link  -> GOES to Cart Page
        driver.findElement(By.cssSelector("[title='View cart']")).click();

        //CART page
        String productName = driver.findElement(By.cssSelector("td.product-name > a")).getText();

         //Assertion on added product on the Cart Page
        Assert.assertEquals(productName,"Blue Shoes");

        //click on proceed to checkout button  on Cart Page  -> GOES to CheckOut Page
        driver.findElement(By.cssSelector(".checkout-button")).click();

         //CHECK OUT page
        //enter firstName
        driver.findElement(By.id("billing_first_name")).sendKeys("Jose");

        //enter lastName
        driver.findElement(By.id("billing_last_name")).sendKeys("Kuri");

        //enter billing address
        driver.findElement(By.id("billing_address_1")).sendKeys("1234 street");

        //enter billing city
        driver.findElement(By.id("billing_city")).sendKeys("California");

        //enter zipcode
        driver.findElement(By.id("billing_postcode")).sendKeys("90002");

        //enter email
        driver.findElement(By.id("billing_email")).sendKeys("jon123@testing.com");

        //click on place order button  -> GOES to Order confirmation Page
        driver.findElement(By.id("place_order")).click();

        //Assert order confirmation text on the Order confirmation page
        String orderConfirmationText = driver.findElement(By.cssSelector(".woocommerce-thankyou-order-received")).getText();

        Assert.assertEquals(orderConfirmationText,"Thank you. Your order has been received.");

    }
}

