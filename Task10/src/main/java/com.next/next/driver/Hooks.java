package com.next.next.driver;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static com.next.next.utils.PopUpHelperUtils.closeChangeCountrySidebar;
import static com.next.next.utils.PopUpHelperUtils.closeCookie;

public class Hooks {

    public static void tryCloseCookie(WebDriver driver){
        try {
            closeCookie(driver);
        } catch (ElementClickInterceptedException e) {
            System.out.println("NoPop Up");
        } catch (NoSuchElementException e) {
            System.out.println("NoPop Up");
        }
    }
    public static void tryCloseChangeCountrySidebar(WebDriver driver){
        try {
            closeChangeCountrySidebar(driver);
        } catch (ElementClickInterceptedException e) {
            System.out.println("NoPop Up");
        } catch (NoSuchElementException e) {
            System.out.println("NoPop Up");
        }
    }
}
