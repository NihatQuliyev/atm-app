package service;
import model.Customer;
import java.util.List;
import java.util.Map;
import static util.InputUtil.*;
import static model.BankNote.bankNote;
import static globalData.GlobalData.data;
public class ATMService{
    public static Map<String, Customer> dataLoad() {
        for (Customer customer: customersLoad()) {
            data.put(customer.getIban(), customer);
        }
        return data;
    }

    public static List<Customer> customersLoad() {
        Customer customer = new Customer("Nihat", "AZ09876", 1234, 5609);
        Customer customer2 = new Customer("Elchin", "AZ09856", 4321, 7890);
        return  List.of(customer, customer2);
    }

    public static boolean password(){
        Map<String, Customer> map = dataLoad();
        for (int i = 0; i < 3; i++) {
            try {
                String iban = stringInput("Enter the iban: ");
                int password = intInput("Enter the password: ");
                Customer customer = map.get(iban);
                if (customer.getPassword() == password) {
                    System.out.println("-------------------> Welcome: " + customer.getName());
                    System.out.println("-------------------> Balance: " + customer.getMoney());
                    atmService(customer);
                } else {
                    System.out.println("wrong password or iban");
                }
            }catch (Exception e){
                System.out.println("Wrong iban or password");
            }
        }
        return true;
    }


    public static boolean atmService(Customer customer){
        boolean isTrue =true;
        while (isTrue) {
            int inputMoney = intInput("-------------------> Enter the money: ");
            int thisMoney = customer.getMoney();
            if (thisMoney >= inputMoney) {
                isTrue = false;
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
                System.out.println("Wrong amount !");
            }
        }
        return true;
    }
}


