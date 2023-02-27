package exception;

import enumExceptionStatus.EnumException;

public class NotFoundPassword_OR_IBAN extends Exception {
    public NotFoundPassword_OR_IBAN() {
        super(EnumException.NOT_FOUND_PASSWORD_OR_IBAN.name());
    }
}
