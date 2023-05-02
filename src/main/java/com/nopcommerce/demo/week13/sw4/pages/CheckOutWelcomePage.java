package com.nopcommerce.demo.week13.sw4.pages;

import com.nopcommerce.demo.week13.sw4.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutWelcomePage extends Utility {
    By welcomeTitle = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    public String getTextFromWelcomeSignInTitle() {
        return getTextFromElement(welcomeTitle);
    }

    By checkOutAsGuestButton = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public void clickCheckoutAsGuestButton(){
        clickOnElement(checkOutAsGuestButton);
    }
}
