package service;
import static util.MenuUtil.entry;
import static service.ATMService.password;
public class ManagementService {
    public void management() {
        while (true) {
            int option = entry();
            switch (option) {
                case 1:
                    password();
                    break;
                case 2:
                    System.exit(-1);
                default:
                    System.out.println("wrong count!");

            }
        }
    }
}
