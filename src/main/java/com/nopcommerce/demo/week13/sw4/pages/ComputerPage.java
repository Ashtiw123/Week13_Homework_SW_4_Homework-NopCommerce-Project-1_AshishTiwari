package com.nopcommerce.demo.week13.sw4.pages;

import com.nopcommerce.demo.week13.sw4.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

    By desktopOption = By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");


    public void clickOnDesktopOption(){
        clickOnElement(desktopOption);
    }
}
