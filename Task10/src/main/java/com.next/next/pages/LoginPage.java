package com.next.next.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    private String url = "https://www.next.co.uk/secure/account/Login";

    private static final By INPUT_LOGIN_FIELD = By.xpath("//input[@id = 'EmailOrAccountNumber']");
    private static final By INPUT_PASSWORD_FIELD = By.xpath("//input[@id = 'Password']");
    private static final By SIGN_IN_BUTTON = By.xpath("//input[@id = 'SignInNow']");
    private static final By ERROR_BLOCK = By.xpath("//div[@class='SignInTo']//div[@class='msgContent']");

    private static final By REGISTER_NOW_BUTTON = By.xpath("//div[@class='SecondaryContainer']//a");

    private static final By FORGOT_PASSWORD_POPUP_TITLE = By.cssSelector("#dialogWindowHeader");

    private static final By FORGOT_PASSWORD_LINK = By.cssSelector(".forgottenPassword");

    public WebElement getInputLoginField() {
        return driver.findElement(INPUT_LOGIN_FIELD);
    }

    public WebElement getInputPasswordField() {
        return driver.findElement(INPUT_PASSWORD_FIELD);
    }

    public WebElement getLoginButton() {
        return driver.findElement(SIGN_IN_BUTTON);
    }

    public WebElement getRegisterNowButton() {
        return driver.findElement(REGISTER_NOW_BUTTON);
    }

    public WebElement getErrorBlock() {
        return driver.findElement(ERROR_BLOCK);
    }

    public String getUrl() {
        return url;
    }

    public WebElement getForgotPasswordPopupTitleElement() {
        return driver.findElement(FORGOT_PASSWORD_POPUP_TITLE);
    }

    public WebElement getForgotPasswordLink() {
        return driver.findElement(FORGOT_PASSWORD_LINK);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}

