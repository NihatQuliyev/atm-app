package exception;
import enumExceptionStatus.EnumException;
public class WrongAmount extends Exception{
    public WrongAmount() {
        super(EnumException.WRONG_AMOUNT.name());
    }
}
