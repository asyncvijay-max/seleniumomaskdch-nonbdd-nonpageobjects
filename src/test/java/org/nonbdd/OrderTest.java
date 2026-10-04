package org.nonbdd;


import org.nonbdd.base.BaseTest;
import org.nonbdd.pages.HomePage;
import org.testng.annotations.Test;

public class OrderTest extends BaseTest {

    @Test
    public void guestCheckOutOrderConfirmationwithPOM() {

        driver.get("https://askomdch.com/");
        HomePage homePage = new HomePage(driver);
        homePage.navigateToStorePagefromHomePage();



    }
}



// https://github.com/asyncvijay-max/seleniumomaskdch-nonbdd-nonpageobjects/blob/main/src/test/java/org/nonbdd/tests/OrderTest.java
