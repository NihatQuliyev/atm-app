package helper;
import model.Customer;
import java.util.List;
import java.util.Map;
import static globalData.GlobalData.data;
public class AtmServiceHelp {
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
}
