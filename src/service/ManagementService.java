package service;
import exception.InvalidOption;
import exception.NotFoundPassword_OR_IBAN;
import java.util.InputMismatchException;
import static util.MenuUtil.entry;
import static service.AtmService.password;
public class ManagementService {
    public void management() {
        while (true) {
            try {
                int option = entry();
                switch (option) {
                    case 1:
                        password();
                        break;
                    case 2:
                        System.exit(-1);
                    default:
                        throw new InvalidOption();
                }
            } catch (NotFoundPassword_OR_IBAN e) {
                System.out.println(e.getMessage());
            }catch (InputMismatchException e){
                System.out.println(e);
            }catch (InvalidOption e){
                System.out.println(e.getMessage());
            }
        }
    }
}
