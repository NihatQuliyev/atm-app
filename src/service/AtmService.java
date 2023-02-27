package service;
import exception.NotFoundPassword_OR_IBAN;
import exception.WrongAmount;
import model.Customer;
import java.util.Map;
import static helper.AtmServiceHelp.dataLoad;
import static util.InputUtil.*;
import static model.BankNote.bankNote;
public class AtmService {
    public static boolean password() throws NotFoundPassword_OR_IBAN{
        Map<String, Customer> map = dataLoad();
        for (int i = 0; i < 3; i++) {
            String iban = stringInput("Enter the iban: ");
            int password = intInput("Enter the password: ");
            Customer customer = map.get(iban);
            if (customer.getPassword() == password) {
                System.out.println("-------------------> Welcome: " + customer.getName());
                System.out.println("-------------------> Balance: " + customer.getMoney());
                atmService(customer);
            } else {
                throw new NotFoundPassword_OR_IBAN();
            }
        }
        return true;
    }
    public static boolean atmService(Customer customer)  {
            int inputMoney = intInput("-------------------> Enter the money: ");
            int thisMoney = customer.getMoney();
            try {
                if (thisMoney >= inputMoney) {
                    int newMoney = thisMoney - inputMoney;
                    while (inputMoney >= 1) {
                        for (int i = 0; i < bankNote.length; i++) {
                            int count = inputMoney / bankNote[i];
                            if (count >= 1) {
                                System.out.println(" -> MoneyEs:  (" + bankNote[i] + ")  -> Count: " + count);
                                inputMoney -= count * bankNote[i];
                            }
                        }
                        System.out.println("-> BYE");
                    }
                    customer.setMoney(newMoney);
                } else {
                    throw new WrongAmount();
                }
            }catch (WrongAmount e){
                System.out.println(e.getMessage());
            }
        return true;
    }
}


