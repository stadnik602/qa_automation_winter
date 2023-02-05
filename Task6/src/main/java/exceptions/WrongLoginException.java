package exceptions;

import java.io.IOException;

public class WrongLoginException extends IOException {

    public WrongLoginException() {
        super("Your login should contain '_' symbol.\n" +
                "Your login length should be less then 20 symbols.");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
