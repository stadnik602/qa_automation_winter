package exceptions;

import java.io.IOException;

public class WrongPasswordException extends IOException {

    public WrongPasswordException() {
        super("Your password should contain '_' and '!' symbols.\n" +
                "Your password length should be less then 20 symbols.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
