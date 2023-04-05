package loginflow;

import com.next.next.flow.LoginFlow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
@Nested
public class LoginFlowTest extends BaseTest{

    private LoginFlow loginFlow = new LoginFlow(driver);

//    @Test
//    public void openLoginPage() {
//        driver.get("https://www.next.co.uk/secure/account/Login");
//        loginFlow.setInputLoginField("admin");
//        loginFlow.clickLogin();
//        Assertions.assertTrue(loginFlow.isErrorBlock());
//    }

    @Test
    public void checkForgotPasswordPopupIsDisplayed() {
        driver.get(loginFlow.getLoginPageUrl());
        String expectedResult = "Forgotten Your Password?";
        loginFlow.openForgotPasswordPopup();
        String actualResult = loginFlow.getForgotPasswordPopupTitle();
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
