package com.next.next.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpHelperUtils {

    private final static By acceptCookieButton = By.xpath("//button[@id = 'onetrust-accept-btn-handler']");
    private final static By closeChangeCountrySidebarButton = By.xpath("//button[@data-testid='country-selector-close-button']");


    public static void closeCookie(WebDriver driver){
        driver.findElement(acceptCookieButton).click();
    }

    public static void closeChangeCountrySidebar(WebDriver driver) {
        driver.findElement(closeChangeCountrySidebarButton).click();
    }
}
