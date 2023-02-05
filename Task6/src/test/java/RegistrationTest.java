import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest {

    @Test
    void shouldFailBigLogin() {
        String expectedMessageForBigLogin = "Your login length should be less then 20 symbols";
        WrongLoginException exception = Assertions
                .assertThrows(WrongLoginException.class, () -> Main.registration("_1234567890123456789", "12345!_", "12345!_"));
        Assertions.assertEquals(expectedMessageForBigLogin,exception.getMessage());
    }

    @Test
    void shouldFailLoginWithoutUnderscore() {
        Assertions.assertThrows(WrongLoginException.class, () -> Main.registration("1234567890", "12345!_", "12345!_"));
    }

    @Test
    void shouldFailBigPassword() {
        String expectedMessageForBigPassword = "Your password length should be less then 20 symbols";
        WrongPasswordException exception = Assertions
                .assertThrows(WrongPasswordException.class, () -> Main.registration("_12345", "12345678905453453452345d5!_", "12345!_"));
        Assertions.assertEquals(expectedMessageForBigPassword,exception.getMessage());
    }

    @Test
    void shouldSuccessRegistration() throws WrongLoginException, WrongPasswordException {
        boolean bool = Main.registration("_12345", "123456!_", "123456!_");
        Assertions.assertTrue(bool);
    }



}
