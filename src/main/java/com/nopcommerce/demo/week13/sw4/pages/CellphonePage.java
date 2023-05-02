package com.nopcommerce.demo.week13.sw4.pages;

import com.nopcommerce.demo.week13.sw4.utilities.Utility;
import org.openqa.selenium.By;

public class CellphonePage extends Utility {

    By cellPhoneText = By.xpath("//h1[contains(text(),'Cell phones')]");
    public String getCellPhoneText() {
        return getTextFromElement(cellPhoneText);
    }

    By listButton = By.xpath("//a[contains(text(),'List')]");
    public void clickOnTheListButton(){
        clickOnElement(listButton);
    }

    By nokiaProduct = By.xpath("//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]");
    public void clickOnThePhoneOption(){
        clickOnElement(nokiaProduct);
    }
}
