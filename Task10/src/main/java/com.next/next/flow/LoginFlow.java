package com.next.next.flow;

import com.next.next.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow extends AbstractFlow{

   private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        super(driver);
        this.loginPage = new LoginPage(driver);
    }

    public void login(String email, String password){
        setInputLoginField(email);
        setInputPasswordField(password);
        clickLogin();
    }

    public void setInputLoginField(String login) {
        loginPage.getInputLoginField().clear();
        loginPage.getInputLoginField().sendKeys(login);
    }

    public void setInputPasswordField(String password) {
        loginPage.getInputPasswordField().clear();
        loginPage.getInputPasswordField().sendKeys(password);
    }

    public void clickLogin() {
        loginPage.getLoginButton().click();
    }

    public boolean isErrorBlock() {
        return loginPage.getErrorBlock().isDisplayed();
    }

    public void openForgotPasswordPopup() {
        loginPage.getForgotPasswordLink().click();
    }

    public String getForgotPasswordPopupTitle() {
        return loginPage.getForgotPasswordPopupTitleElement().getText();
    }

    public String getLoginPageUrl() {
        return loginPage.getUrl();
    }



    public LoginPage getLoginPage() {
        return loginPage;
    }
}
