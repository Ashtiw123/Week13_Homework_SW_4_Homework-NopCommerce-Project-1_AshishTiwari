package com.nopcommerce.demo.week13.sw4.testbase;

import com.nopcommerce.demo.week13.sw4.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = "Chrome";
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
    closeBrowser();
    }
}