package exception;
import enumExceptionStatus.EnumException;

import java.util.InputMismatchException;

public class InvalidOption extends Exception {
    public InvalidOption() {
        super(EnumException.INVALID_OPTION.name());
    }
}
