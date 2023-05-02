package com.nopcommerce.demo.week13.sw4.testsuite;

import com.nopcommerce.demo.week13.sw4.pages.HomePage;
import com.nopcommerce.demo.week13.sw4.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
//only test methods will be in this class

    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation() {
        String expectedMessage = "Computers\n" +
                "Electronics\n" +
                "Apparel\n" +
                "Digital downloads\n" +
                "Books\n" +
                "Jewelry\n" +
                "Gift Cards";
        String actualText = homePage.findAllTabsInTopMenu();
        Assert.assertEquals(actualText, expectedMessage, "Top menu is not displayed");
    }
}
